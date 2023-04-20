pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Deploy') {
            steps {
                deploy war: 'target/myapp.war', tomcatUrl: 'http://localhost:8080', credentialsId: 'my-credentials-id'
            }
        }
    }
}
