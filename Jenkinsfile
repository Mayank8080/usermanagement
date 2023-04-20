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
                deploy war: 'target/myapp.war', tomcatUrl: 'http://localhost:9006', credentialsId: 'my-credentials-id'
            }
        }
    }
}
