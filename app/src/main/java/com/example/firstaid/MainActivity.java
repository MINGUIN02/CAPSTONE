package com.example.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int selectedTab = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final LinearLayout guideLayout =  findViewById(R.id.guideLayout);
        final LinearLayout mapLayout = findViewById(R.id.mapLayout);
        final LinearLayout hazardLayout = findViewById(R.id.hazardLayout);
        final LinearLayout contactsLayout = findViewById(R.id.contactsLayout);

        final ImageView guideImage = findViewById(R.id.guideImage);
        final ImageView mapImage = findViewById(R.id.mapImage);
        final ImageView hazardImage = findViewById(R.id.hazardImage);
        final ImageView contactsImage = findViewById(R.id.contactsImage);

        final TextView guideTxt = findViewById(R.id.guideTxt);
        final TextView mapTxt = findViewById(R.id.mapTxt);
        final TextView hazardTxt = findViewById(R.id.hazardTxt);
        final TextView contactsTxt = findViewById(R.id.contactsTxt);



        // set guide fragment as default.
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainer, GuideFragment.class, null)
                .commit();
        guideLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // check  if guide is already selected or not.

                if (selectedTab != 1){

                    // set guide fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, GuideFragment.class, null)
                            .commit();


                    // Unselect other tab except guide tab
                    mapTxt.setVisibility(View.GONE);
                    hazardTxt.setVisibility(View.GONE);
                    contactsTxt.setVisibility(View.GONE);

                    mapImage.setImageResource(R.drawable.ic_map);
                    hazardImage.setImageResource(R.drawable.ic_hazard);
                    contactsImage.setImageResource(R.drawable.ic_contacts);


                    mapLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    hazardLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    contactsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    // Select Guide tab

                    guideTxt.setVisibility(View.VISIBLE);
                    guideImage.setImageResource(R.drawable.ic_guide_selected);
                    guideLayout.setBackgroundResource(R.drawable.round_back_guide_100);

                    // Create Animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    guideLayout.startAnimation(scaleAnimation);

                    // set 1st tab as selected
                    selectedTab = 1;

                }

            }
        });


        mapLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // check  if map is already selected or not.

                if (selectedTab != 2){

                    // Select map fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, MapFragment.class, null)
                            .commit();

                    // Unselect other tab except map tab
                    guideTxt.setVisibility(View.GONE);
                    hazardTxt.setVisibility(View.GONE);
                    contactsTxt.setVisibility(View.GONE);

                    guideImage.setImageResource(R.drawable.ic_guide);
                    hazardImage.setImageResource(R.drawable.ic_hazard);
                    contactsImage.setImageResource(R.drawable.ic_contacts);


                    guideLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    hazardLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    contactsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    // Select Guide tab

                    mapTxt.setVisibility(View.VISIBLE);
                    mapImage.setImageResource(R.drawable.ic_map_selected);
                    mapLayout.setBackgroundResource(R.drawable.round_back_map_100);

                    // Create Animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    mapLayout.startAnimation(scaleAnimation);

                    // set 2nd tab as selected
                    selectedTab = 2;

                }

            }
        });


        hazardLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // check  if hazard is already selected or not.

                if (selectedTab != 3){


                    // Select hazard fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, HazardFragment.class, null)
                            .commit();


                    // Unselect other tab except hazard tab
                    guideTxt.setVisibility(View.GONE);
                    mapTxt.setVisibility(View.GONE);
                    contactsTxt.setVisibility(View.GONE);

                    guideImage.setImageResource(R.drawable.ic_guide);
                    mapImage.setImageResource(R.drawable.ic_map);
                    contactsImage.setImageResource(R.drawable.ic_contacts);


                    guideLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    mapLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    contactsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    // Select Guide tab

                    hazardTxt.setVisibility(View.VISIBLE);
                    hazardImage.setImageResource(R.drawable.ic_hazard_selected);
                    hazardLayout.setBackgroundResource(R.drawable.round_back_hazard_100);

                    // Create Animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    hazardLayout.startAnimation(scaleAnimation);

                    // set 3rd tab as selected
                    selectedTab = 3;

                }

            }
        });

        contactsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // check  if contacts is already selected or not.

                if (selectedTab != 4){


                    // Select Contacts fragment
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, ContactsFragment.class, null)
                            .commit();

                    // Unselect other tab except contacts tab
                    guideTxt.setVisibility(View.GONE);
                    mapTxt.setVisibility(View.GONE);
                    hazardTxt.setVisibility(View.GONE);

                    guideImage.setImageResource(R.drawable.ic_guide);
                    mapImage.setImageResource(R.drawable.ic_map);
                    hazardImage.setImageResource(R.drawable.ic_hazard);


                    guideLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    mapLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    hazardLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    // Select Guide tab

                    contactsTxt.setVisibility(View.VISIBLE);
                    contactsImage.setImageResource(R.drawable.ic_contacts_selected);
                    contactsLayout.setBackgroundResource(R.drawable.round_back_contacts_100);

                    // Create Animation
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    contactsLayout.startAnimation(scaleAnimation);

                    // set 4th tab as selected
                    selectedTab = 4;


                }

            }
        });


    }


}