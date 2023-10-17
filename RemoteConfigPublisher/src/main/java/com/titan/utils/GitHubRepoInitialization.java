package com.titan.utils;

import com.google.common.io.CharStreams;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GitHubRepoInitialization {
    public static void main(String[] args) throws IOException {
        String githubRawUrl = "https://api.github.com/repos/shivanititan/Firebase-Remote/contents/RemoteConfigPublisher/src/main/resources/Product_team/multi_sport";
        String accessToken = "";

        List<String> fileContents = getAllFilesContents(githubRawUrl, accessToken);
        for (String content : fileContents) {

            System.out.println("File Content:");
            System.out.println(content);
            System.out.println("--------------------------------------");
        }
    }
    public static List<String> getAllFilesContents(String githubRawUrl, String accessToken) throws IOException {
        List<String> fileContents = new ArrayList<>();
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(githubRawUrl);
            httpGet.addHeader(HttpHeaders.AUTHORIZATION, "token" + accessToken);
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                if (response.getStatusLine().getStatusCode() == 200) {
                    String jsonResponse = EntityUtils.toString(response.getEntity());
                    JSONArray files = new JSONArray(jsonResponse);
                    for (int i = 0; i < files.length(); i++) {
                        JSONObject file = files.getJSONObject(i);
                        if (file.has("download_url")) {
                            String downloadUrl = file.getString("download_url");
                            String fileNames = null;
                            if (file.has("name")) {
                                fileNames = file.getString("name");
                                System.out.println(fileNames);
                                String fileContent = getFileContent(downloadUrl);
                                fileContents.add(fileContent);
                            }
                        }
                    }
                } else {
                    System.err.println("Failed to fetch files from GitHub: " + response.getStatusLine());
                }
            }
        }
        return fileContents;
    }
    public static String getFileContent(String fileUrl) throws IOException {
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(fileUrl);
            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {
                if (response.getStatusLine().getStatusCode() == 200) {
                    return CharStreams.toString(new InputStreamReader(response.getEntity().getContent()));
                } else {
                    System.err.println("Failed to fetch file from GitHub: " + response.getStatusLine());
                }
            }
        }
        return "";
    }
}
