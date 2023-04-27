pipeline {
    agent any

    stages{
        stage("git"){
            steps{
                git url: 'https://github.com/Mayank8080/usermanagement.git', branch: 'feature1'

            }
        }
        
        stage('Deploy to Tomcat') {
            parallel{
                stage("Build"){
            steps{
                sh 'mvn clean install'
            }
        }
       stage('Deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'TomcatCredentials', url: 'http://localhost:8085/')], contextPath: '/usermanagement', war: '**/*.war'
            }
        }
            }
        }
         stage("deploy-server2"){
             parallel{
                      stage("Build"){
            steps{
                sh 'mvn clean install'
            }
        }
                 
            steps{
              sshagent(['deploy_user']) {
               sh "scp -o StrictHostKeyChecking=no -i /home/mayank/Downloads/tomcat-server1.pem target/UserManagement1.war ec2-user@13.234.119.210:/opt/apache-tomcat-9.0.74/webapps"
              }
            }
        }
         }
        }
}


