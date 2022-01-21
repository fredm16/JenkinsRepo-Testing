pipeline    {
agent any

stages{
    stage ('Compile Stage')
        stage{
        withMaven(maven: 'maven-3-8-4')     {
                sh 'mvn clean compile'
             }
        }
    }
    stage('Testing Stage'){
        stage{
        withMaven(maven: 'maven-3-8-4')     {
                sh 'mvn test'
             }
        }
    }
    stage('Deployment Stage'){
        stage{
        withMaven(maven: 'maven-3-8-4')     {
                sh 'mvn deploy'
             }
        }
    }
}