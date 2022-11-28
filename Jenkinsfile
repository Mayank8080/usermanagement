node('master') {
    stage('scm') {
        checkout scm
    }
    stage('build') {
        withMaven(jdk: 'JDK9.0.1', maven: 'Maven3.5.2') {
            sh 'mvn clean install'
        }
    }
}
