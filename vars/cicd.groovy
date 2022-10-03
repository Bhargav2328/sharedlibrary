def newGit(repo)
{
  git "$(repo)"
}

def newMaven()
{
  sh 'mvn package'
}

def newDeploy(jobname,ip,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapp/${context}.war"
}

def runSelenium(jobname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
