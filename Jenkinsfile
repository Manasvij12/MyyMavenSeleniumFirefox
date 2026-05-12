pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Clone') {
            steps {
                git 'https://github.com/Manasvij12/MyyMavenSeleniumFirefox.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Selenium') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }
}
