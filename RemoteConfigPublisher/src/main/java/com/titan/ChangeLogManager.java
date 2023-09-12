package com.titan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ChangeLogManager {

    public List<ChangeLogs> getFilesChanged() throws IOException {

        File file = new File("RemoteConfigPublisher/src/main/resources/ChangedFiles.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        ArrayList<String> list = new ArrayList<String>();
        String st;
        while ((st = br.readLine()) != null) {
            list.add(st);
        }
        ArrayList<ChangeLogs> changeLogs = new ArrayList<ChangeLogs>();
        for (String item : list) {
            String[] split = item.split("\t");
            if (split.length > 1) {
                ChangeLogStatus status = null;
                switch (split[0]) {
                    case "M": {
                        status = ChangeLogStatus.MODIFIED;
                        break;
                    }
                    case "A": {
                        status = ChangeLogStatus.NEW;
                        break;
                    }
                    case "D": {
                        status = ChangeLogStatus.DELETED;
                        break;
                    }
                }
                if (status != null) {
                    changeLogs.add(new ChangeLogs(split[1], status));
                }
            }
        }
        return changeLogs;
    }
}

class ChangeLogs {
    private String fileName;
    private ChangeLogStatus status;

    public ChangeLogs(String fileName, ChangeLogStatus status) {
        this.fileName = fileName;
        this.status = status;
    }

    public String getFileName() {
        return fileName;
    }

    public ChangeLogStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ChangeLogs{" +
                "fileName='" + fileName + '\'' +
                ", status=" + status +
                '}';
    }
}

enum ChangeLogStatus {
    NEW,
    MODIFIED,
    DELETED
}
