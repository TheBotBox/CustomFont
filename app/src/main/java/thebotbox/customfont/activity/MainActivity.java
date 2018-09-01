package thebotbox.customfont.activity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.TextView;

import bot.box.customfont.Fuente;
import butterknife.BindView;
import butterknife.ButterKnife;
import thebotbox.customfont.R;

public class MainActivity extends BaseActivity {

    @BindView(R.id.agency_r)
    TextView agency_r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        if (isStoragePermissionGranted()) {
            loadOnViews();
        } else
            requestStoragePermission();
    }

    private void loadOnViews() {
        agency_r.setTypeface(Fuente.CALLIGRAPHY.abbeyline(this));

    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            loadOnViews();
        } else {
            requestStoragePermission();
        }
    }
}
