package com.example.periodictable1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class Elements_list extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elements_list);
        hideNavigationBar();

        ImageButton buttonMain = findViewById(R.id.imageButton_back);
        buttonMain.setOnClickListener(v -> toCover());

        Button buttonHydrogen = findViewById(R.id.button_hydrogen);
        buttonHydrogen.setOnClickListener(v -> toHydrogen());

        Button buttonHelium = findViewById(R.id.button_helium);
        buttonHelium.setOnClickListener(v -> toHelium());

        Button buttonLithium = findViewById(R.id.button_Lithium);
        buttonLithium.setOnClickListener(v -> toLithium());

        Button buttonBeryllium = findViewById(R.id.button_Beryllium);
        buttonBeryllium.setOnClickListener(v -> toBeryllium());

        Button buttonBoron = findViewById(R.id.button_Boron);
        buttonBoron.setOnClickListener(v -> toBoron());

        Button buttonCarbon = findViewById(R.id.button_Carbon);
        buttonCarbon.setOnClickListener(v -> toCarbon());

        Button buttonNitrogen = findViewById(R.id.button_Nitrogen);
        buttonNitrogen.setOnClickListener(v -> toNitrogen());

        Button buttonOxygen = findViewById(R.id.button_Oxygen);
        buttonOxygen.setOnClickListener(v -> toOxygen());

        Button buttonFluorine = findViewById(R.id.button_Fluorine);
        buttonFluorine.setOnClickListener(v -> toFluorine());


        Button buttonNeon = findViewById(R.id.button_Neon);
        buttonNeon	.setOnClickListener(v -> toNeon());

        Button buttonSodium = findViewById(R.id.button_Sodium);
        buttonSodium.setOnClickListener(v -> toSodium());

        Button buttonMagnesium = findViewById(R.id.button_Magnesium);
        buttonMagnesium.setOnClickListener(v -> toMagnesium());

        Button buttonAluminum = findViewById(R.id.button_Aluminum);
        buttonAluminum.setOnClickListener(v -> toAluminum());

        Button buttonSilicon = findViewById(R.id.button_Silicon);
        buttonSilicon.setOnClickListener(v -> toSilicon());

        Button buttonPhosphorus = findViewById(R.id.button_Phosphorus);
        buttonPhosphorus.setOnClickListener(v -> toPhosphorus());

        Button buttonSulfur = findViewById(R.id.button_Sulfur);
        buttonSulfur.setOnClickListener(v -> toSulfur());

        Button buttonChlorine = findViewById(R.id.button_Chlorine);
        buttonChlorine.setOnClickListener(v -> toChlorine());

        Button buttonArgon = findViewById(R.id.button_Argon);
        buttonArgon.setOnClickListener(v -> toArgon());

        Button buttonPotassium = findViewById(R.id.button_Potassium);
        buttonPotassium.setOnClickListener(v -> toPotassium());

        Button buttonCalcium = findViewById(R.id.button_Calcium);
        buttonCalcium.setOnClickListener(v -> toCalcium());

        Button buttonScandium = findViewById(R.id.button_Scandium);
        buttonScandium.setOnClickListener(v -> toScandium());

        Button buttonTitanium = findViewById(R.id.button_Titanium);
        buttonTitanium.setOnClickListener(v -> toTitanium());

        Button buttonVanadium = findViewById(R.id.button_Vanadium);
        buttonVanadium.setOnClickListener(v -> toVanadium());

        Button buttonChromium = findViewById(R.id.button_Chromium);
        buttonChromium.setOnClickListener(v -> toChromium());

        Button buttonManganese = findViewById(R.id.button_Manganese);
        buttonManganese.setOnClickListener(v -> toManganese());

        Button buttonIron = findViewById(R.id.button_Iron);
        buttonIron.setOnClickListener(v -> toIron());

        Button buttonCobalt = findViewById(R.id.button_Cobalt);
        buttonCobalt.setOnClickListener(v -> toCobalt());

        Button buttonNickel = findViewById(R.id.button_Nickel);
        buttonNickel.setOnClickListener(v -> toNickel());

        Button buttonCopper = findViewById(R.id.button_Copper);
        buttonCopper.setOnClickListener(v -> toCopper());

        Button buttonZinc = findViewById(R.id.button_Zinc);
        buttonZinc.setOnClickListener(v -> toZinc());

    }

    private void toHydrogen(){
        Intent intent = new Intent(Elements_list.this , Hydrogen.class );
        startActivity(intent);
    }

    private void toHelium(){
        Intent intent = new Intent(Elements_list.this , Helium.class );
        startActivity(intent);
    }

    private void toLithium(){
        Intent intent = new Intent(Elements_list.this , Lithium.class );
        startActivity(intent);
    }

    private void toBeryllium(){
        Intent intent = new Intent(Elements_list.this , Beryllium.class );
        startActivity(intent);
    }

    private void toBoron(){
        Intent intent = new Intent(Elements_list.this , Boron.class );
        startActivity(intent);
    }

    private void toCarbon(){
        Intent intent = new Intent(Elements_list.this , Carbon.class );
        startActivity(intent);
    }

    private void toNitrogen(){
        Intent intent = new Intent(Elements_list.this , Nitrogen.class );
        startActivity(intent);
    }

    private void toOxygen(){
        Intent intent = new Intent(Elements_list.this , Oxygen.class );
        startActivity(intent);
    }

    private void toFluorine(){
        Intent intent = new Intent(Elements_list.this , Fluorine.class );
        startActivity(intent);
    }

    private void toNeon(){
        Intent intent = new Intent(Elements_list.this , Neon.class );
        startActivity(intent);
    }

    private void toSodium(){
        Intent intent = new Intent(Elements_list.this , Sodium.class );
        startActivity(intent);
    }

    private void toMagnesium(){
        Intent intent = new Intent(Elements_list.this , Magnesium.class );
        startActivity(intent);
    }

    private void toAluminum(){
        Intent intent = new Intent(Elements_list.this , Aluminum.class );
        startActivity(intent);
    }

    private void toSilicon(){
        Intent intent = new Intent(Elements_list.this , Silicon.class );
        startActivity(intent);
    }

    private void toPhosphorus(){
        Intent intent = new Intent(Elements_list.this , Phosphorus.class );
        startActivity(intent);
    }

    private void toSulfur(){
        Intent intent = new Intent(Elements_list.this , Sulfur.class );
        startActivity(intent);
    }

    private void toChlorine(){
        Intent intent = new Intent(Elements_list.this , Chlorine.class );
        startActivity(intent);
    }

    private void toArgon(){
        Intent intent = new Intent(Elements_list.this , Argon.class );
        startActivity(intent);
    }
    private void toPotassium(){
        Intent intent = new Intent(Elements_list.this , Potassium.class );
        startActivity(intent);
    }

    private void toCalcium(){
        Intent intent = new Intent(Elements_list.this , Calcium.class );
        startActivity(intent);
    }

    private void toScandium(){
        Intent intent = new Intent(Elements_list.this , Scandium.class );
        startActivity(intent);
    }

    private void toTitanium(){
        Intent intent = new Intent(Elements_list.this , Titanium.class );
        startActivity(intent);
    }

    private void toVanadium(){
        Intent intent = new Intent(Elements_list.this , Vanadium.class );
        startActivity(intent);
    }

    private void toChromium(){
        Intent intent = new Intent(Elements_list.this , Chromium.class );
        startActivity(intent);
    }

    private void toManganese(){
        Intent intent = new Intent(Elements_list.this , Manganese.class );
        startActivity(intent);
    }

    private void toIron(){
        Intent intent = new Intent(Elements_list.this , Iron.class );
        startActivity(intent);
    }

    private void toCobalt(){
        Intent intent = new Intent(Elements_list.this , Cobalt.class );
        startActivity(intent);
    }

    private void toNickel(){
        Intent intent = new Intent(Elements_list.this , Nickel.class );
        startActivity(intent);
    }

    private void toCopper(){
        Intent intent = new Intent(Elements_list.this , Copper.class );
        startActivity(intent);
    }

    private void toZinc(){
        Intent intent = new Intent(Elements_list.this , Zinc.class );
        startActivity(intent);
    }

    private void toCover(){
        Intent intent = new Intent(Elements_list.this , MainActivity.class );
        startActivity(intent);
    }

    private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION|
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

    }

    protected void onStop(){
        super.onStop();
        //your code for stopping the sound
    }


}

