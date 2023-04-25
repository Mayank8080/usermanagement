pipeline {
    agent any

    stages{
        stage("git"){
            steps{
                git url: 'https://github.com/Mayank8080/usermanagement.git', branch: 'feature1'

            }
        }
        stage("Build"){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('Copy war file') {
            steps {
                sh 'cp target/*.war /opt/tomcat/webapps'
            }
        }
        stage('Deploy to Tomcat') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'TomcatCredentials', url: 'http://localhost:9090/')], contextPath: '/webapp', war: '**/*.war'
            }
        }
        }
}


