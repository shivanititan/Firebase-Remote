pipeline {
    agent any

    environment {
        mavenTool = 'Maven 3.9.4'
        gitRemoteUrl = 'https://github.com/shivanititan/Firebase-Remote.git'
    }

    stages {
        stage('Checkout code') {
            steps {
                checkout scm
            }
        }

        stage('Set up JDK') {
            steps {
                tool name: 'JDK 17', type: 'jdk'
            }
        }

         // stage('Pull logs') {
         //    steps {
         //       script {
         //          bat "git config --global user.name K-Sowjanya"
         //          bat "git config --global user.email konudulasowjanya@titan.co.in"
         //          bat "git pull origin main"  // Pull the latest changes from remote main branch
         //          bat "git log -n 1 --stat --name-status --format= -- Firebase-Remote/RemoteConfigPublisher/src/main/resources > Firebase-Remote/RemoteConfigPublisher/src/main/resources/ChangedFiles.txt"
         //          bat "git add Firebase-Remote/RemoteConfigPublisher/src/main/resources/ChangedFiles.txt"
         //          bat 'git commit -m "Write file names which have changes to ChangedFiles.txt"'
         //          // bat "git add remote origin https://github.com/shivanititan/Firebase-Remote.git"
         //          bat "git push origin HEAD:refs/heads/main"


         //       }                 
         //    }
        // }
         stage('Build with Maven') {
            steps {
                 tool name: mavenTool, type: 'hudson.tasks.Maven$MavenInstallation'
                 bat "\"${tool(name: mavenTool, type: 'hudson.tasks.Maven$MavenInstallation')}/bin/mvn\" -B clean compile package --file Firebase-Remote/RemoteConfigPublisher/pom.xml"
            }
        }
        stage('Compile and Run Java Program') {
            steps {
                script {
                    def javaCmd = "${tool(name: 'JDK 17', type: 'jdk')}/bin/java"
                    bat "\"${javaCmd}\" -cp \"C:/ProgramData/Jenkins/.jenkins/workspace/Firebase_Remote_Config/Firebase-Remote/RemoteConfigPublisher/target/RemoteConfigPublisher-1.0-SNAPSHOT.jar\" com.titan.RemoteConfigPublisher"
                }
            }
        }
    }
}