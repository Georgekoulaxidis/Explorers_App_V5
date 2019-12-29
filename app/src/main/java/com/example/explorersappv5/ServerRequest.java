package com.example.explorersappv5;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.provider.Settings;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class ServerRequest {

    ProgressDialog progressDialog;
    public static final int CONNECTION_TIMEOUT = 1000 *15;
    public static final String SERVER_ADDRESS = "hhtp://explorers110.tk";

    public ServerRequest(Context context){
        progressDialog = new ProgressDialog(context);
        progressDialog.setCancelable(false);
        progressDialog.setTitle("Processing");
        progressDialog.setMessage("Please wait...");
    }

    public void storeUserDataInBackground(User user, GetUserCallback callback){
        progressDialog.show();
        new StoreUserDataAsyncTask().execute();
    }

    public void fetchUserDataInBackground(User user, GetUserCallback callback){
        progressDialog.show();
    }
    public class StoreUserDataAsyncTask extends AsyncTask<Void, Void, Void>{
        User user;
        GetUserCallback userCallback;


        public StoreUserDataAsyncTask(User user, GetUserCallback callback){
            this.user = user;
            this.userCallback = userCallback;




        }

        @Override
        protected Void doInBackground(Void... params) {
            ArrayList<NameValuePair> dataToSend = new ArayList<>

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {

            progressDialog.dismiss();
            userCallback.done(null);

            super.onPostExecute(aVoid);
        }
    }
}


