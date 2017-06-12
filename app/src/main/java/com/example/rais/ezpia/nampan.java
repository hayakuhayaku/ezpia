package com.example.rais.ezpia;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nampan extends AppCompatActivity {

    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
    private SoundPool soundpool;
    private int sounda, soundb, soundc, soundd,sounde, soundf, soundg, soundh, soundi, soundj, soundk, soundl, soundm, soundn, soundo, soundp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nampan);

        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        d = (Button) findViewById(R.id.d);
        e = (Button) findViewById(R.id.e);
        f = (Button) findViewById(R.id.f);
        g = (Button) findViewById(R.id.g);
        h = (Button) findViewById(R.id.h);
        i = (Button) findViewById(R.id.i);
        j = (Button) findViewById(R.id.j);
        k = (Button) findViewById(R.id.k);
        l = (Button) findViewById(R.id.l);
        m = (Button) findViewById(R.id.m);
        n = (Button) findViewById(R.id.n);
        o = (Button) findViewById(R.id.o);
        p = (Button) findViewById(R.id.p);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundpool = new SoundPool.Builder().setMaxStreams(5).build();
        } else {
            soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        sounda = soundpool.load(this, R.raw.a, 1);
        soundb = soundpool.load(this, R.raw.b, 1);
        soundc = soundpool.load(this, R.raw.c, 1);
        soundd = soundpool.load(this, R.raw.d, 1);
        sounde = soundpool.load(this, R.raw.e, 1);
        soundf = soundpool.load(this, R.raw.f, 1);
        soundg = soundpool.load(this, R.raw.g, 1);
        soundh = soundpool.load(this, R.raw.h, 1);
        soundi = soundpool.load(this, R.raw.i, 1);
        soundj = soundpool.load(this, R.raw.j, 1);
        soundk = soundpool.load(this, R.raw.k, 1);
        soundl = soundpool.load(this, R.raw.l, 1);
        soundm = soundpool.load(this, R.raw.m, 1);
        soundn = soundpool.load(this, R.raw.n, 1);
        soundo = soundpool.load(this, R.raw.o, 1);
        soundp = soundpool.load(this, R.raw.p, 1);


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sounda, 1, 1, 0, 0, 1);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundb, 1, 1, 0, 0, 1);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundc, 1, 1, 0, 0, 1);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundd, 1, 1, 0, 0, 1);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(sounde, 1, 1, 0, 0, 1);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundf, 1, 1, 0, 0, 1);
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundg, 1, 1, 0, 0, 1);
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundh, 1, 1, 0, 0, 1);
            }
        });

        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundi, 1, 1, 0, 0, 1);
            }
        });

        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundj, 1, 1, 0, 0, 1);
            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundk, 1, 1, 0, 0, 1);
            }
        });

        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundl, 1, 1, 0, 0, 1);
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundm, 1, 1, 0, 0, 1);
            }
        });

        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundn, 1, 1, 0, 0, 1);
            }
        });

        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundo, 1, 1, 0, 0, 1);
            }
        });

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundp, 1, 1, 0, 0, 1);
            }
        });

    }
}
