package com.mka.chara.jokesnotpearl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class Gallery03 extends AppCompatActivity {

    public static String IMGS[] = {
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F301.jpg?alt=media&token=8b10a7a5-7c5c-4a87-b604-d2b6e2b7f496",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F302.jpg?alt=media&token=badadeb8-be80-4823-a017-bf780fa83474",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F303.jpg?alt=media&token=3514d489-af50-4cf2-8f29-95af2501083a",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F304.jpg?alt=media&token=61db1cb3-3842-4561-816f-b0f4615cfe7b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F305.jpg?alt=media&token=08df3c7d-0f3d-4cbd-86c7-b24917e7ee8c",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F306.jpg?alt=media&token=229579ed-16cf-4187-ba71-59bce32b3a18",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F307.jpg?alt=media&token=a414fc6d-a62c-48e8-870b-ea3f3c355d94",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F308.jpg?alt=media&token=6b3d1390-a7d5-41cd-821c-bee9a3693d56",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F309.jpg?alt=media&token=7a0da008-c345-495c-bec7-927c31a01fae",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F310.jpg?alt=media&token=cd2d0776-c8bb-4036-be2e-d985b45d21d5",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F311.jpg?alt=media&token=cae6fa4e-e446-4a3d-9b8f-1f14b2a97e79",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F312.jpg?alt=media&token=506d5e30-6283-4fab-93d2-e028453c62da",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F313.jpg?alt=media&token=03392a7d-04cc-4245-be63-0e495228f860",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F314.jpg?alt=media&token=74c056ee-0854-4146-802d-5f41bf931e6b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F315.jpg?alt=media&token=0ac99274-30c4-428b-bb7e-0dd6154ccd2d",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F316.jpg?alt=media&token=70d97151-745d-4477-bfe3-2234d9b000b2",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F317.jpg?alt=media&token=7babdb7e-32e0-408d-97b8-076f5f841ed5",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F318.jpg?alt=media&token=ead9f305-4927-48a3-b1ba-3d66de1e944b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F319.jpg?alt=media&token=1a143c81-244f-4989-8280-acd62bfb9ec7",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F320.jpg?alt=media&token=b034dc84-9902-480c-9843-a69f9b4b6aea",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F321.jpg?alt=media&token=e85070aa-ddef-4e44-bece-b7ff368270ac",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F322.jpg?alt=media&token=4aa42e0d-5107-45a0-97e0-83bb4e6f0935",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F323.jpg?alt=media&token=8ce03532-652d-4845-a611-f2c9cd644a2d",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F324.jpg?alt=media&token=f84b61ed-09ec-44a1-b6f4-feeb3d587f22",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F325.jpg?alt=media&token=38040508-b237-47c0-a582-614feebe4647",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F326.jpg?alt=media&token=37848abb-6975-4ca9-97fd-ab3bb4317e99",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F327.jpg?alt=media&token=54df73bf-5db0-492c-9a8c-455501f8e203",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F328.jpg?alt=media&token=7443eddc-932d-4793-9183-e855e835e4a1",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F329.jpg?alt=media&token=94641eac-9d0a-41ec-b0a6-df3cb29a6463",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F330.jpg?alt=media&token=99568a4e-6d72-4cb9-a4b5-f30ec090e9bb",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F331.jpg?alt=media&token=fa400d5a-7662-4801-a040-2768334b17b5",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F332.jpg?alt=media&token=6c44b5b0-5e49-419c-8268-5c4d3e9e987e",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F333.jpg?alt=media&token=747c7c09-b6bf-49cd-8752-c9e76a4d5c0d",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F334.jpg?alt=media&token=24815b07-526b-45eb-9ad9-cbd021b3ff1f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F335.jpg?alt=media&token=537b1a99-2bf2-4d85-bc0d-a9b1cf272843",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F336.jpg?alt=media&token=dfa5d63c-e029-415b-8671-8e1ac70bafe1",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F337.jpg?alt=media&token=d0f6fda6-802c-49b9-a53a-bb9e920bd6f9",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F338.jpg?alt=media&token=f11191f6-23c6-4352-96b4-d2588015f028",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F339.jpg?alt=media&token=f2b00f84-4e5d-4f75-8a0b-54ab5267e8d0",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup3%2F340.jpg?alt=media&token=a4c1eeb3-8bf4-412d-9c95-617b96406aa8"
    };
    GalleryAdapter mAdapter;
    RecyclerView mRecyclerView;
    ArrayList<ImageModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery03);

        for (int i = 0; i < IMGS.length; i++) {

            ImageModel imageModel = new ImageModel();
            imageModel.setName("แคปชั่นเด็ด " + (i + 1));
            imageModel.setUrl(IMGS[i]);
            data.add(imageModel);

        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        mRecyclerView.setHasFixedSize(true);


        mAdapter = new GalleryAdapter(Gallery03.this, data);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this,
                new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position) {

                        Intent intent = new Intent(Gallery03.this, DetailActivity.class);
                        intent.putParcelableArrayListExtra("data", data);
                        intent.putExtra("pos", position);
                        startActivity(intent);

                    }
                }));

    }

}
