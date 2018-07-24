package com.example.alstn0107.kctrecyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    int images[]={R.drawable.irean1,R.drawable.irean2,R.drawable.irean3,R.drawable.irean1,R.drawable.irean2,R.drawable.irean3,R.drawable.irean3,R.drawable.irean2};

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //XML디자인 한 부분 적용 함수  그니까 이미지뷰를 만든거

        int width=viewGroup.getResources().getDisplayMetrics().widthPixels/3;//폭의 3분에 1


        //xml recyclerview에  image뷰 가져옴
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_item,viewGroup,false);
        view.setLayoutParams(new LinearLayoutCompat.LayoutParams(width,width));//정사각형


        return new RowCell(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        //XML 디자인한 부분에 안에 내용변경 그안에 사진을 넣어야 되니까 그 사진을 넣은부분
        ((RowCell)viewHolder).imageView.setImageResource(images[i]);

    }

    @Override
    public int getItemCount() {

        //아이템을 측정하는 카운터   image다섯개면 카운트5 그럼 5번돌개끔해야겠지지
        return images.length;  //  카운트 수 가 return
    }

    private static class RowCell extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public RowCell(View view) {
            super(view);
            imageView=(ImageView)view.findViewById(R.id.recyclerview_item_imageview);


        }
    }
}

