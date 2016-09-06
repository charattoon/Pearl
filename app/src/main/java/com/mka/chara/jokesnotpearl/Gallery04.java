package com.mka.chara.jokesnotpearl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class Gallery04 extends AppCompatActivity {

    public static String IMGS[] = {
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F401.jpg?alt=media&token=27a38f26-82d5-414a-b306-739efe624c99",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F402.jpg?alt=media&token=92f53f9e-bc71-42f2-b219-232dfadaa262",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F403.jpg?alt=media&token=daeb2a37-d7fd-4e61-a78b-da628ba5bf29",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F404.jpg?alt=media&token=9420c96f-f1a2-4804-a538-b9cc5e84b157",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F405.jpg?alt=media&token=4445a2d9-b29b-4ece-bcc6-a354eeb8d601",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F406.jpg?alt=media&token=c692305b-a081-473d-9ba4-2e11d1f5d947",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F407.jpg?alt=media&token=2678f115-ae83-402c-9a47-d4973b5e6011",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F408.jpg?alt=media&token=b862a3fb-53cc-4121-b461-87d2a4337535",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F409.jpg?alt=media&token=de32f304-f962-411b-80ca-55dab47ff212",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F410.jpg?alt=media&token=db7abdbf-e5ba-4fed-8341-075aabc730cb",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F411.jpg?alt=media&token=818db3cb-1de0-4b68-953c-5663686af88e",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F412.jpg?alt=media&token=5fb0f0b5-eb83-4e52-bf7f-8b1bb83e88f4",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F413.jpg?alt=media&token=79580acb-1d4c-4972-b0a7-c3015ad8b4e2",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F414.jpg?alt=media&token=4784a907-cc30-4fd9-9ea0-b5130f1a8a1d",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F415.jpg?alt=media&token=76ea2178-3d8e-48c2-9f00-c64ece13558a",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F416.jpg?alt=media&token=0bd59dab-21f2-40dc-9a5a-1e0f086cee2f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F417.jpg?alt=media&token=9af22bfa-c43b-45bf-88a2-71b3121d90fd",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F418.jpg?alt=media&token=9f016d29-0c6f-4a44-93a6-e392af5f2d0a",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F419.jpg?alt=media&token=a4cae806-5966-4cf6-9e64-67864eeb2d92",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F420.jpg?alt=media&token=fad1bf19-f8ce-4798-b7e2-27032c6c425c",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F421.jpg?alt=media&token=aab37e49-83f7-4de8-8bd6-9556fb15ffb6",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F422.jpg?alt=media&token=ae48f2bc-47d9-4f3f-b5c0-4c5ccb922aaf",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F423.jpg?alt=media&token=a8fa807a-8313-43c8-a13e-9f43458ffd29",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F424.jpg?alt=media&token=d102188b-b3a3-4857-95b0-1212ee30c425",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F425.jpg?alt=media&token=d5bf0d52-737b-42ec-839b-68007353ef9f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F426.jpg?alt=media&token=7effba08-4e7d-4549-80c9-745f13bace40",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F427.jpg?alt=media&token=9f2c79cf-5544-4d1f-b090-92105421bd9b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F428.jpg?alt=media&token=5ee9c503-1c73-4d72-a632-48e1d9be938a",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F429.jpg?alt=media&token=882c1b29-b8f9-4c01-bb53-97452c369d58",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F430.jpg?alt=media&token=eec0a8bf-efbd-4d52-805c-b13e14570243",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F431.jpg?alt=media&token=92cd2b39-0660-4f8c-921c-6e7bd3ca5248",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F432.jpg?alt=media&token=acf6133e-5fd0-4462-acc9-db1345a6daac",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F433.jpg?alt=media&token=22accb8c-3a24-49c8-be5d-bc33c50a21e2",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F434.jpg?alt=media&token=42482538-1fe5-4553-8046-55b7f4de7de6",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F435.jpg?alt=media&token=f3f40693-54b9-4c35-943f-aff0c8b1599d",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F436.jpg?alt=media&token=e89c6876-294f-453e-918f-c4c735db47cb",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F437.jpg?alt=media&token=7423b11b-f2bf-46b7-8ccd-3125ea4abeea",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F438.jpg?alt=media&token=68c3d711-d35d-4764-b56d-ca6f0ad86fae",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F439.jpg?alt=media&token=c4124ada-bf04-44e5-94c6-3837ef64e5ff",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup4%2F440.jpg?alt=media&token=0f5816a3-3712-45f3-8ec2-b9fb0721ff3c"
    };
    GalleryAdapter mAdapter;
    RecyclerView mRecyclerView;
    ArrayList<ImageModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery04);

        for (int i = 0; i < IMGS.length; i++) {

            ImageModel imageModel = new ImageModel();
            imageModel.setName("คำถามกวนๆ " + (i + 1));
            imageModel.setUrl(IMGS[i]);
            data.add(imageModel);

        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        mRecyclerView.setHasFixedSize(true);


        mAdapter = new GalleryAdapter(Gallery04.this, data);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this,
                new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position) {

                        Intent intent = new Intent(Gallery04.this, DetailActivity.class);
                        intent.putParcelableArrayListExtra("data", data);
                        intent.putExtra("pos", position);
                        startActivity(intent);

                    }
                }));

    }

}
