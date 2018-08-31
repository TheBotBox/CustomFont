package thebotbox.customfont.activity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.TextView;

import bot.box.customfont.CustomFont;
import bot.box.customfont.CustomFontFactory;
import butterknife.BindView;
import butterknife.ButterKnife;
import thebotbox.customfont.R;

public class MainActivity extends BaseActivity {

    @BindView(R.id.agency_r)
    TextView agency_r;

    @BindView(R.id.agency_b)
    TextView agency_b;

    @BindView(R.id.star_jedi)
    TextView star_jedi;

    @BindView(R.id.star_jedi_1)
    TextView star_jedi_1;

    @BindView(R.id.machine)
    TextView machine;

    @BindView(R.id.space_age)
    TextView space_age;

    @BindView(R.id.astro_boy)
    TextView astro_boy;

    @BindView(R.id.metal_lord)
    TextView metal_lord;

    @BindView(R.id.saucer)
    TextView saucer;

    @BindView(R.id.raider_crusader)
    TextView raider_crusader;

    @BindView(R.id.arkitech_l)
    TextView arkitech_l;

    @BindView(R.id.arkitech_m)
    TextView arkitech_m;

    @BindView(R.id.arkitech_b)
    TextView arkitech_b;

    @BindView(R.id.elektra)
    TextView elektra;

    @BindView(R.id.alien)
    TextView alien;

    @BindView(R.id.vtks)
    TextView vtks;

    @BindView(R.id.droid_nation)
    TextView droid_nation;

    @BindView(R.id.dameron)
    TextView dameron;

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
        agency_r.setTypeface(CustomFont.amatic_r(this));
        agency_b.setTypeface(CustomFont.amatic_b(this));

        star_jedi.setTypeface(CustomFont.star_jedi(this));
        star_jedi_1.setTypeface(CustomFont.star_jedi_1(this));

        machine.setTypeface(CustomFont.machine(this));

        space_age.setTypeface(CustomFont.space_age(this));

        astro_boy.setTypeface(CustomFont.astro_boy(this));

        metal_lord.setTypeface(CustomFont.metal_lord(this));

        saucer.setTypeface(CustomFont.saucer(this));

        raider_crusader.setTypeface(CustomFont.raider_crusader(this));

        arkitech_l.setTypeface(CustomFont.arkitech_l(this));
        arkitech_m.setTypeface(CustomFont.arkitech_m(this));
        arkitech_b.setTypeface(CustomFont.arkitech_b(this));

        alien.setTypeface(CustomFont.alien(this));

        elektra.setTypeface(CustomFont.elektra(this));

        vtks.setTypeface(CustomFont.vtks(this));

        droid_nation.setTypeface(CustomFont.droid_nation(this));

        dameron.setTypeface(CustomFont.dameron(this));
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
