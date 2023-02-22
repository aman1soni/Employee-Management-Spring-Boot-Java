pipeline{
    agent any
    tools{
        maven 'Maven_home'
        jdk 'java_jdk'
        }
    stages{
        stage('git' ){
                    steps{
                            git credentialsId:'GitLab',url:'https://git.nagarro.com/GITG00641/Java/3166893.git'
                        }
                    }
    stage('build'){
                steps{
                    bat 'mvn -f EmployeeMgmtSprinBoot_Adv_java_5_(2)/pom.xml clean install'
                    }
        }
}
}