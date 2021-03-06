package sst.pracha.myapplication.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import sst.pracha.myapplication.R;

/**
 * Created by pracha on 14/12/2560.
 */

public class MyAlerDialog {


    private Context context;

    public MyAlerDialog(Context context) {
        this.context = context;
    }


    public  void  normalDialog(String titleString, String messageString) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
builder.setIcon(R.drawable.ic_action_alert);
builder.setTitle(titleString);
builder.setMessage(messageString);
builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
});
builder.show();
    }

}//Main class
