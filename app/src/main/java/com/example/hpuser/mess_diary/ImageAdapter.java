package com.example.hpuser.mess_diary;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageAdapter extends PagerAdapter {

    private Context mcontext;
    private int[]Imageid=new int[]{R.drawable.gallery1, R.drawable.gallery2,R.drawable.gallery3,R.drawable.gallery4, R.drawable.gallery5,R.drawable.gallery6,R.drawable.img6, R.drawable.img5,R.drawable.img7,R.drawable.img1, R.drawable.img2,R.drawable.img3,R.drawable.img4

    };

    ImageAdapter(Context context){mcontext=context;

    }

    @Override
    public int getCount() {
        return Imageid.length;

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView=new ImageView(mcontext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(Imageid[position]);
        container.addView(imageView,0);
        return imageView;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView)object);
    }
}
