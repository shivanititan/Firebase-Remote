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

         stage('Pull logs') {
            steps {
               script {
                  bat "git config --global user.name K-Sowjanya"
                  bat "git config --global user.email konudulasowjanya@titan.co.in"
                  bat "git pull origin main"  // Pull the latest changes from remote main branch
                  bat "git log -n 1 --stat --name-status --format= -- Firebase-Remote/RemoteConfigPublisher/src/main/resources > Firebase-Remote/RemoteConfigPublisher/src/main/resources/ChangedFiles.txt"
                  bat "git add Firebase-Remote/RemoteConfigPublisher/src/main/resources/ChangedFiles.txt"
                  bat 'git commit -m "Write file names which have changes to ChangedFiles.txt"'
                  // bat "git add remote origin https://github.com/shivanititan/Firebase-Remote.git"
                  bat "git branch -M main"
                  bat "git push origin main"
               }                 
            }
        
        }
    }
}
