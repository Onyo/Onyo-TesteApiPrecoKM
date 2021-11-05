pipeline {
    agent any
        stages{
            stage ('Build'){
                steps{
                    bat 'mvn clean package -DskipTests=true'
                }
         }
         stage ('Testes API'){
                steps{
                    bat 'mvn test'
                }
         }
    }
}