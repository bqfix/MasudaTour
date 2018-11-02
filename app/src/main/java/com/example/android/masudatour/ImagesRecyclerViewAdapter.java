package com.example.android.masudatour;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImagesRecyclerViewAdapter extends RecyclerView.Adapter<ImagesRecyclerViewAdapter.ImageViewHolder>{

    private int[] mImages;

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public ImageViewHolder(ImageView imageView) {
            super(imageView);
            mImageView = imageView;
        }
    }


    //Constructor
    public ImagesRecyclerViewAdapter(int[] images) {
        mImages = images;
    }

    //Create new views
    @NonNull
    @Override
    public ImagesRecyclerViewAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        ImageView image = (ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_view, viewGroup, false);

        ImageViewHolder imageViewHolder = new ImageViewHolder(image);
        return imageViewHolder;
    }

    //Replace the contents of a view
    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.mImageView.setImageResource(mImages[position]);
    }

    @Override
    public int getItemCount() {
        return mImages.length;
    }
}
