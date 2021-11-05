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
    post{
        always{
            junit allowEmptyResults: true, testResults: 'target/surefire-reports/*.xml'
        }
        fixed{
            emaillesxt attachLog: true, body: 'See the attached log below', subject: 'Build is fine!!!', to: 'leafarccomputacao@gmail.com'
        }
    }
}