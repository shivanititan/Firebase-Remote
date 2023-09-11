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
    }
}
