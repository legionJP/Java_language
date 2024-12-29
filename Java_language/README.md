### JAVA Programming: 

- Java Programming concept 

 
>[!NOTE]
> This is Java Guide with Concepts and Examples 

### Git Important Command and Concept for Revision

``` diff

-1. Git init
By default the git branch is on master branch 

+ git init -b main [Branch name will be main]

-2. Git Commit
+ git adds command will add file 
+ git commit -a , -m  {It will add the file from staging to in tracking }
+ git checksums is created for every commit , checksum of the 14 char
- git log : commit history 

-3 Add the file directly into tracking and skip the staging area
+ git commit -a -m "Added file2"
+ git add . {add all the files}


-4 Git diff
!$ git diff 
it will show tha changes in the files


-5 Remove the file from git repo
+ git rm --cached file1.txt
{It will be untracked now from git }

-6 Github repos


-7 Git Branch: 
+ git branch -M main  >>> creates the main branch


- SSH vs HTTPS  login  and Branch Clone 

-ssh
+ ssh-keygen -o
+ add the id_rsa.pub to the github 
+ git remote add origin git@github.com:user/repo
+ git push -u origin main

-https
+ clone and set the global config and use the fine grade token or password

- Git push 
+ git push origin main 
 check origin 
+ git remote -v

- Git Tag

+ Vesrion no is tag
- git tag :  {Show all the given tag}

+ add tag
- git tag -a v1.0 -m "!st release"

+ info about tag
- git show v1.0

+ push the tag
git push  origin v1.0 


```

>[!NOTE]
> 1. Staging area is area which git tracks and we work on with 
