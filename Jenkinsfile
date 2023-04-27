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
       
        stage('Deploy to Tomcat') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'TomcatCredentials', url: 'http://localhost:8085/')], contextPath: '/usermanagement', war: '**/*.war'
            }
        }
         stage("deploy-server2"){
            steps{
              sshagent(['deploy_user']) {
               sh "scp -o StrictHostKeyChecking=no server/target/usermanagement.war ec2-user@13.234.114.160:/opt/apache-tomcat-9.0.74/webapps"
              }
            }
        }
        }
}


