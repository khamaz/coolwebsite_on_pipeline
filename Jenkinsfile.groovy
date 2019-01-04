pipeline{
    agent any
    triggers {
        cron('* * * * *')
    }
    stages{
       stage("Git Clone"){
           steps{
              git "git@github.com:khamaz/webserver_with_jenkins.git"
           }
       }
       stage("Copy file to Web"){
           steps{
               sh "cp -f index.html /var/www/html/index.html"
           }
       }
       stage("Test1"){
           steps{
               sh "echo Test"
           }
       }
    }
}