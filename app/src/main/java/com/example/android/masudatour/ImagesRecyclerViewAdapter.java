package com.example.android.masudatour;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImagesRecyclerViewAdapter extends RecyclerView.Adapter<ImagesRecyclerViewAdapter.ImageViewHolder>{

    //Global variable to hold passed in array of image IDs
    private int[] mImages;

    //In-line ViewHolder class to hold the ImageView to be used
    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;

        //ViewHolder Constructor
        public ImageViewHolder(ImageView imageView) {
            super(imageView);
            mImageView = imageView;
        }
    }


    //Constructor for Adapter
    public ImagesRecyclerViewAdapter(int[] images) {
        mImages = images;
    }

    //Create new views
    @NonNull
    @Override
    public ImagesRecyclerViewAdapter.ImageViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        //Inflate a new ImageView
        ImageView imageView = (ImageView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.image_view, viewGroup, false);

        //Create a ViewHolder using the inflated ImageView
        ImageViewHolder imageViewHolder = new ImageViewHolder(imageView);
        return imageViewHolder;
    }

    //Replace the contents of an existing ViewHolder's view by calling from the list of image IDs passed in on Adapter creation
    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder imageViewHolder, int position) {
        imageViewHolder.mImageView.setImageResource(mImages[position]);
    }

    //Length of RecyclerView should be equal to the length of the passed-in array
    @Override
    public int getItemCount() {
        return mImages.length;
    }
}
