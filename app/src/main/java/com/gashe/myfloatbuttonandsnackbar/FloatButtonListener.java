package com.gashe.myfloatbuttonandsnackbar;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by cice on 18/2/17.
 */

public class FloatButtonListener implements View.OnClickListener {

    private Context context;

    public FloatButtonListener(Context context) {
        this.context = context;
    }

    @Override
    public void onClick(View view) {

        Snackbar snackbar = Snackbar.make(view, "Se presionó el botón flotante", Snackbar.LENGTH_LONG);
        snackbar.setActionTextColor(Color.GREEN);
        snackbar.setAction("Hacer algo", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snack = Snackbar.make(view, "Estás haciendo algo", Snackbar.LENGTH_LONG);
                snack.show();
            }
        });

        snackbar.setCallback(new Snackbar.Callback() {
            @Override
            public void onShown(Snackbar sb) {
                super.onShown(sb);
            }

            @Override
            public void onDismissed(Snackbar transientBottomBar, int event) {
                super.onDismissed(transientBottomBar, event);
            }
        });
        snackbar.show();

    }
}
