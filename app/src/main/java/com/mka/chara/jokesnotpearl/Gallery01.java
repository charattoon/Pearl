package com.mka.chara.jokesnotpearl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;

public class Gallery01 extends AppCompatActivity {

    public static String IMGS[] = {
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F101.jpg?alt=media&token=8f4c2fff-169a-47ab-87d3-b7b272fd9e00",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F102.jpg?alt=media&token=b89b9cd2-52fc-4008-ad53-3d510a669d03",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F103.jpg?alt=media&token=b5daac5f-d8d3-4197-a1e4-23d601739606",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F104.jpg?alt=media&token=f2dc88ad-0844-4fce-8494-96d19358b248",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F105.jpg?alt=media&token=2e81e88a-db62-4582-bc45-a1d733db8be5",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F106.jpg?alt=media&token=6f87bb7d-e5c9-48ee-bdb0-34c3b8ff1d1f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F107.jpg?alt=media&token=b8f506b6-6902-45cf-a3f8-a1379d69db93",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F108.jpg?alt=media&token=ee7910d4-e25d-4112-8403-22366be43c5b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F109.jpg?alt=media&token=30a4c8b1-c752-4165-b676-c5680d837be5",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F110.jpg?alt=media&token=af3782ae-7105-477c-8cc1-b7c965a1faab",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F111.jpg?alt=media&token=9a902d89-487d-4d9b-b730-e9faabe831c0",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F112.jpg?alt=media&token=ef0868c4-c34c-446f-a47b-1d9e28cd2b5b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F113.jpg?alt=media&token=98ec6441-238e-4155-8215-e7d4a673b50f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F114.jpg?alt=media&token=01fcace2-e3b3-438f-a15c-45cf6fc7d579",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F115.jpg?alt=media&token=297e9e3c-bd2b-44c1-bdeb-fb9b98a1ca6a",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F201.jpg?alt=media&token=7695d3b3-af86-4681-ba52-8995f50ce189",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F202.jpg?alt=media&token=353e8fc3-9db3-4081-8f06-4c71701c76d6",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F203.jpg?alt=media&token=2ebd4067-0da2-4772-ad3c-f061fa4fe28c",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F204.jpg?alt=media&token=4324c4ae-ea51-423d-a7fe-cb3bff57fdb2",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F205.jpg?alt=media&token=dd332c88-78b6-45dc-b463-1575cd6dafe0",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F206.jpg?alt=media&token=79ab5e93-6c85-41b6-9adc-6ac840e01ad1",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F207.jpg?alt=media&token=2dde6e05-46f3-45df-96f0-cd4990175a80",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F208.jpg?alt=media&token=3813eb65-8949-4325-9fa9-a460845fa272",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F209.jpg?alt=media&token=fbdc2a9f-39aa-4b74-9e6f-0d0ee1a94166",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F210.jpg?alt=media&token=2aee8c57-033f-4306-ab7c-7e9bdf1bcec6",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F211.jpg?alt=media&token=ed3a3bcc-d7c5-420b-94c2-de294574515d",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F212.jpg?alt=media&token=99b2035d-4ca1-405f-9aac-95d0b76650c4",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F213.jpg?alt=media&token=670651e6-74bd-4239-acca-fc0bb0761fc5",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F214.jpg?alt=media&token=ca133c65-5be0-4d52-b35e-a885d424fb54",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F215.jpg?alt=media&token=9f4ca534-460f-424c-8373-23008dce5eba",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F216.jpg?alt=media&token=1ea8b4f8-fb6a-49c3-8a92-86f3b0e29648",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F217.jpg?alt=media&token=4be985a7-1532-4dd9-b1e3-3f5ea8771f0e",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F218.jpg?alt=media&token=ef9b65ab-4e66-482f-bffc-46f7682c6b6f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F219.jpg?alt=media&token=fbee9e52-9f4b-4972-9af1-8fa6328f2da2",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F220.jpg?alt=media&token=9ecd02f7-95fa-4e27-bcb9-c5994295e205",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F221.jpg?alt=media&token=295c2dba-4101-46b0-8557-67649d381378",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F222.jpg?alt=media&token=ea73df88-fc1f-4a0d-8181-2f9c1e9b25af",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F223.jpg?alt=media&token=e629d6a2-ef1a-43b8-a7eb-aba5f60df1c5",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F224.jpg?alt=media&token=471d31de-29c9-48b2-8dc8-00ae13793fbd",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F225.jpg?alt=media&token=50c46b29-8437-4da4-9b96-8a13642fe25b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F226.jpg?alt=media&token=9581ec74-09ee-4012-844d-edbdd1830d4f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F227.jpg?alt=media&token=b9935989-b5ce-474a-8afb-247ed9130449",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F228.jpg?alt=media&token=8c196a89-e41e-4090-a0de-5b46ec07c74a",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F229.jpg?alt=media&token=3acad3b5-b740-404b-8abf-9ee52188adb2",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F230.jpg?alt=media&token=4d70227c-a1ad-4c28-8b6b-25f0ba2f9332",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F231.jpg?alt=media&token=77b273a9-d086-4964-b826-ef5dfe167e29",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F232.jpg?alt=media&token=3fbc2e4a-8b94-4599-8385-9eb1a8ea24a9",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F233.jpg?alt=media&token=e6a7acff-3012-4fcd-97cc-d55e9d50377f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F234.jpg?alt=media&token=870af768-6c40-4f43-a04e-a00670f54f1f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F235.jpg?alt=media&token=e52aa37c-d32c-4467-a999-d842066c6ee6",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F236.jpg?alt=media&token=61feee62-1a13-4191-a1fb-c8761b112482",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F237.jpg?alt=media&token=4944c06e-f30e-40fb-8dd4-2a8d109d9a13",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F238.jpg?alt=media&token=221f2dc2-e06f-405f-9dc1-07e5037a6e63",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F239.jpg?alt=media&token=ccd8efdf-1b88-47a5-bc0b-7d4b01f12715",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F240.jpg?alt=media&token=1a11905f-aa35-42ea-b042-2d54e3ece312",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup1%2F241.jpg?alt=media&token=dac548d7-cf20-48eb-9c88-aaf8b373ba77"
    };
    GalleryAdapter mAdapter;
    RecyclerView mRecyclerView;
    ArrayList<ImageModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery01);

        for (int i = 0; i < IMGS.length; i++) {

            ImageModel imageModel = new ImageModel();
            imageModel.setName("คำคมวงเหล้า " + (i + 1));
            imageModel.setUrl(IMGS[i]);
            data.add(imageModel);

        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        mRecyclerView.setHasFixedSize(true);


        mAdapter = new GalleryAdapter(Gallery01.this, data);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this,
                new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position) {

                        Intent intent = new Intent(Gallery01.this, DetailActivity.class);
                        intent.putParcelableArrayListExtra("data", data);
                        intent.putExtra("pos", position);
                        startActivity(intent);

                    }
                }));

    }

}
