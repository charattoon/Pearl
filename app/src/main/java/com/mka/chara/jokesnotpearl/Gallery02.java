package com.mka.chara.jokesnotpearl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class Gallery02 extends AppCompatActivity {

    public static String IMGS[] = {
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F101.jpg?alt=media&token=e8de5db5-080b-4774-8935-fe5e514eb0b6",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F102.jpg?alt=media&token=180b6261-b7c9-4feb-b438-aea886a7e4c7",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F103.jpg?alt=media&token=ec88db1c-697d-440b-ae96-4f38a7d1c12c",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F104.jpg?alt=media&token=f3e5a6f1-9b01-453b-adc9-e4326e83b7de",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F105.jpg?alt=media&token=acdbf2f7-9d1b-4049-82d2-358d305c6632",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F106.jpg?alt=media&token=ac3fbac1-0124-4327-9cf9-0e2a29c00978",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F107.jpg?alt=media&token=6e321b01-82ea-4f9e-9499-76d2195b7435",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F108.jpg?alt=media&token=acbd6fa7-05ba-4379-b6a6-02044a8b397b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F109.jpg?alt=media&token=5e37132f-d9ee-4e38-9e9c-e1ef130e2f21",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F110.jpg?alt=media&token=b31a5e33-4b22-4a20-b865-47081a962993",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F111.jpg?alt=media&token=28131760-63a8-4ce0-87fb-aacdda79eadb",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F112.jpg?alt=media&token=dff6ba26-3bad-4c58-a204-c68c6ecce3f6",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F113.jpg?alt=media&token=3082d195-3e9c-4ae9-ba59-05a4aece2fd7",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F114.jpg?alt=media&token=1b309116-ccd3-4aa0-8937-ab6a0de4771f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F115.jpg?alt=media&token=88bd81cd-ba2e-401d-94e0-1daa91267714",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F116.jpg?alt=media&token=920c4828-15d4-45dc-bb82-a96931cf20bf",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F117.jpg?alt=media&token=d2833fea-3879-457f-9644-c33378ee4877",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F118.jpg?alt=media&token=c4f61dfc-ff66-477b-bb1b-cc7d507b09fa",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F119.jpg?alt=media&token=6831d502-4fe5-4fa7-9744-ddd4202a7527",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F120.jpg?alt=media&token=c588f83a-591f-4699-b799-93b6fb4b6c65",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F121.jpg?alt=media&token=e01822a2-f863-4232-a6d1-5ff3db39cb74",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F122.jpg?alt=media&token=e76c254a-ce19-4d38-a29e-35ef9d2ee15c",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F123.jpg?alt=media&token=bdfa5bcc-b529-4a5c-8f39-8b201e462b2b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F124.jpg?alt=media&token=5ebc87e6-69db-4cec-9a6e-2beeadfca339",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F125.jpg?alt=media&token=b03e1311-be7f-4667-9a4a-65d3db90ba23",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F126.jpg?alt=media&token=4dd581f0-daad-461d-9679-2a6d96ac391d",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F127.jpg?alt=media&token=38741f2a-a50c-41be-8f5a-5dd12c268e62",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F128.jpg?alt=media&token=f67235e0-08a8-4270-93eb-3af6ebb1735a",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F129.jpg?alt=media&token=aaba94e2-7abf-4ea8-aae6-49273dea18ee",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F130.jpg?alt=media&token=15b66e04-a6de-4d27-835e-72745b88aa9b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F131.jpg?alt=media&token=133d7c1d-25fd-40d4-b45e-e3a87cbfa0fa",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F132.jpg?alt=media&token=7bdd393a-ea87-4c74-87e7-637eeb40f68b",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F133.jpg?alt=media&token=a8f09e01-bfc3-4748-991f-6500e05d9652",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F134.jpg?alt=media&token=e687bc69-22b9-4bab-84ca-30da3dc7d7cc",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F135.jpg?alt=media&token=907d97ab-6df4-40aa-a193-1825de5cf0b1",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F136.jpg?alt=media&token=8c9af053-8fbe-4eae-b045-54bbe42c7e1f",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F137.jpg?alt=media&token=765a2615-274a-46dd-b7f5-4697b94b360c",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F138.jpg?alt=media&token=c8ebe1a3-f2ba-4357-b3d1-3bdd5040cc0d",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F139.jpg?alt=media&token=bb6cd672-6df8-40ab-9f2a-257ef3f7a3e8",
            "https://firebasestorage.googleapis.com/v0/b/pearl-20344.appspot.com/o/Picture%2FGroup2%2F140.jpg?alt=media&token=d89fdf87-a1d9-4a18-aba5-03bd35723f39"
    };
    GalleryAdapter mAdapter;
    RecyclerView mRecyclerView;
    ArrayList<ImageModel> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery02);

        for (int i = 0; i < IMGS.length; i++) {

            ImageModel imageModel = new ImageModel();
            imageModel.setName("มุขเสี่ยว " + (i + 1));
            imageModel.setUrl(IMGS[i]);
            data.add(imageModel);

        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        mRecyclerView.setHasFixedSize(true);


        mAdapter = new GalleryAdapter(Gallery02.this, data);
        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this,
                new RecyclerItemClickListener.OnItemClickListener() {

                    @Override
                    public void onItemClick(View view, int position) {

                        Intent intent = new Intent(Gallery02.this, DetailActivity.class);
                        intent.putParcelableArrayListExtra("data", data);
                        intent.putExtra("pos", position);
                        startActivity(intent);

                    }
                }));

    }

}
