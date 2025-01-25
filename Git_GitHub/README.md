#
# Git and GitHub 

# Git Commands and Concpet 

# 1. Git Init

```markdown
# 1. Git init
- By default the git branch is on master branch 

- git init -b main [Branch name will be main]

```

``` diff

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

- ---------------------------------------------------------------------------
- Git Tag
- --------------------------------------------------------------------------

+ Vesrion no is tag
- git tag :  {Show all the given tag}

+ add tag
- git tag -a v1.0 -m "!st release"

+ info about tag
- git show v1.0

+ push the tag
git push  origin v1.0 

- ---------------------------------------------------------------------------
- Git Branch 
- --------------------------------------------------------------------------

- Branch Create 
+ git checkout -b  branch2 {create the new branch}
+ git switch -c feature1  {create}

+ git switch branch2
+ git branch {will list the active and all branch }
+ git branch --all

- Delete Branch 
+ git branch -d branch2
+ 

- Git Push Branch to Remote
+ git push origin branch2 

- Git Branch Workings 
+ when  file create/ commit git create the sanpshot file and give the checksum of the commit
+ main points to the commit and Head to the new branch or commit 
+ git log 
+ git graph


- ---------------------------------------------------------------------------
- Git Merge
- --------------------------------------------------------------------------

- git merge branch_name 
+(must be on the main branch to merge other branch on main)
+ always pull the first changes from the remote 

- --------------------------------------------------------------------------
- Git Rebase

+ In rebase you will not see the history of the other or merged branch
+ git log will show the one line commit history 

+ git rebase feature1 
merge with new branch 

- ---------------------------------------------------------------------------
- Git Merge Conflict
- --------------------------------------------------------------------------

+ when the two file are changed same time by different branch or by remote or local conflict will rise

- git merge feature1 

- <<<< current changes 
- >>>> incoming changes
- git diff feature 1 
- {then open file and accept changes }
- git addd . 
- git commit -a
- git push 
- git pull origin main 

+ When conflict rise choose one 
: 1. git config pull.rebase false  #merge 
: 2. git config pull.rebase true  #rebase
: 3. git config pull.f only     # fast-forward only

## Now commit the merge
- git status 
- git add .
- git commit -m "merge"


 ---------------------------------------------------------------------------
- Git Time Travel
- --------------------------------------------------------------------------

- git log
pick the older commit 
- commit 141be21c987dbc5b55c408120ed72ff9bd205090 (tag: v1.0)

go to older commit  # the HEAD is detached 
- git checkout  141be21c987dbc5b55c408120ed72ff9bd205090 (tag: v1.0)
- add the new branch 
- commit the chanegs 
- and push and merge the pull reqiuest


 ---------------------------------------------------------------------------
- Git Stash
- --------------------------------------------------------------------------

+ git stash , when you are working and don't want to push them 
+ it saves the changes without commiting them 

- git stash 
+ save the working directory 
- git stash apply
+ go to main branches and commit the changes 
+ show to another branch where the stash is applied 

---------------------------------------------------------------------------
- Git Fork
- --------------------------------------------------------------------------

+ Fork and make changes in your git account branch 

- Git Pull Request 

+ after the fork make the changes in forked branched and  create the pull request of the changes.


```

>[!NOTE]
> 1. Staging area is area which git tracks and we work on with 
