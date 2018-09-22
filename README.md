
* Now, create a new method called `newTweet()` that will handle accepting input from the user and adding a new tweet to the array called `tweets`. This means you will have to pass the array `tweets` as an argument to `newTweet()`.

* Remove the code from the `main()` method that handles creating a new tweet, and replace it with a call to `newTweet()`.

* Commit, push, and open a new pull request for this feature.

## Final step - Review a Friend's Pull Request - 1 point

When you have completed feature 2, have a classmate [add you as a collaborator](https://help.github.com/articles/inviting-collaborators-to-a-personal-repository/) to their GitHub-Lab repository. Add this classmate as a collaborator on your repository as well. Now it's time for peer review! 

* Code review is an important part of professional software development! Having a fresh set of eyes look at code can improve software quality greatly, and ensure that requirements are met.

* **Every** professional software development company required code review for their developers.

* Add your classmate as [a reviewer for BOTH pull requests](https://help.github.com/articles/requesting-a-pull-request-review/). Have them add you as well.

* Look over your classmate's changes and [add at least two comments about their code to EACH pull request](https://help.github.com/articles/about-pull-request-reviews/). Either approve or request changes to your classmates pull requests.

* Show your reviews to your TA to receive this credit.







    public static String getCurrentTimeStamp(){
        String pattern = "yyyy-MM-dd HH:mm:ss";
SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

String date = simpleDateFormat.format(new Date());
return date;
