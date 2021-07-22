package andrew.fraser.n01309442;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class AF extends Fragment {

    public AF()
    {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab4, container, false);

        /*Button button = (Button) findViewById(R.id.open_btn);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Intent i=getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(i);
            }

        } );
        
         */
    }
    /*public static boolean checkLocationPermissionGranted(final Context context) {
        return ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION)
                == PackageManager.PERMISSION_GRANTED;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[]
            grantResults) {
        Permissions4M.onRequestPermissionsResult(NormalFragment.this, requestCode, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
    
     
    Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), R.string.app_name, Snackbar.LENGTH_LONG);
                        snackbar.setText(R.string.decline);
                        snackbar.show();
                        */

    /*protected void onDraw(Canvas canvas) {
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        RadialGradient radialGradient = new RadialGradient(0,0,25,Color.RED, Color.BLACK, Shader.TileMode.MIRROR);
        paint.setShader(radialGradient);
        canvas.drawRect(100,100,100,paint);

}
*/
     
}