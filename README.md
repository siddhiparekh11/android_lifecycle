# Android Lifecycle
This app was built to get acquainted with activity life cycle.
# Screenshots
<img src="https://user-images.githubusercontent.com/21295081/27233135-528b877e-526d-11e7-998a-91d50c430133.jpeg" width="500"/>
<p>When the app starts, the onResume() on Activity A increments the counter from 0 to 1. </p>
<img src="https://user-images.githubusercontent.com/21295081/27233136-528d2642-526d-11e7-858c-d3e29d198154.jpeg" width="500"/>
<p>Activity A is paused and Activity B has started.</p>
<img src="https://user-images.githubusercontent.com/21295081/27233137-529226f6-526d-11e7-84d6-12e09b852d1d.jpeg" width="500"/>
<p>After Activity B closes, you can observe the thread count is 3 because it incremented on onPause() of Activity A from 1 to 2 ,and onResume() on Activity A incremented the value from 2 to 3.
</p>
<img src="https://user-images.githubusercontent.com/21295081/27233138-5297441a-526d-11e7-85f5-12f3f0d23e90.jpeg" width="500"/>
<p>Activity A is paused and Dialog Activity has gained focus.</p>
<img src="https://user-images.githubusercontent.com/21295081/27233139-5299481e-526d-11e7-8429-3051b54a9b56.jpeg" width="500"/>
<p>The thread counter is 5 as onPause() on Activity A incremented the value from 3 to 4. And onResume() on Activity A incremented the value from 4 to 5.</p>
