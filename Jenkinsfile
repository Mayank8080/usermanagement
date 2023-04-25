pipeline {
    agent any

    stages {
        stage('Clone repository') {
            steps {
                git 'https://github.com/your-repo.git'
            }
        }

        stage('Build war file') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Deploy to Tomcat') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'TomcatCredentials', url: 'http://localhost:9006/')], contextPath: /webapp, war: '**/*.war'
            }
        }
    }
}
