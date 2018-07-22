package org.yourorghere;

import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureIO;
import java.io.File;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

public class Objek {

    static float angle = 0f;
    static float angle2 = 0f;
    static float mercur = 0f;
    static float venus = 0f;
    static float mars = 0f;
    static float jupiter = 0f;
    static float saturn = 0f;
    static float uranus = 0f;
    static float neptune = 0f;
    static float ring = 90f;
    static float direction = 1f;
    static float direction2 = 10f;
    static float direction3 = 5f;
    static float direction4 = 1.2f;
    static float direction5 = 0.9f;
    static float direction6 = 0.3f;
    static Texture matahari, bumi, merkur, ven, bulan, mar, jupit, satur, ura, nept;
    static float direction7 = 0.2f;
    static float direction8 = 0.15f;
    static float direction9 = 0.1f;

    static void sun(GL gl) {

        float amb[] = {1f, 0.34f, 0f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 2f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
//    gl.glShadeModel(GL.GL_SMOOTH);

    }

    static void earth(GL gl) {
        float amb[] = {0.2f, 0.34f, 1f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 90;
        try {
            bumi = TextureIO.newTexture(new File("E:\\KULIAH\\images\\Earth.bmp"), true);

        } catch (Exception e) {
            System.out.println("File not Found");
        }

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 0.5f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        bumi.enable();
        bumi.bind();
        glu.gluQuadricTexture(q, true);

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
        bumi.disable();
//    gl.glShadeModel(GL.GL_SMOOTH);
    }

    static void venus(GL gl) {
        float amb[] = {0.2f, 0.34f, 1f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 0.25f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
//    gl.glShadeModel(GL.GL_SMOOTH);
    }

    static void mercury(GL gl) {
        float amb[] = {0.2f, 0.34f, 1f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 0.125f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();

        GLUquadric q = glu.gluNewQuadric();

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);

//    gl.glShadeModel(GL.GL_SMOOTH);
    }

    static void mars(GL gl) {
        float amb[] = {0.2f, 0.34f, 1f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 0.3f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();

        GLUquadric q = glu.gluNewQuadric();

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);

//  gl.glShadeModel(GL.GL_SMOOTH);
    }

    static void jupiter(GL gl) {
        float amb[] = {0.2f, 0.34f, 1f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 1.5f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();

        GLUquadric q = glu.gluNewQuadric();
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);

//    gl.glShadeModel(GL.GL_SMOOTH);
    }

    static void saturn(GL gl) {
        float amb[] = {0.2f, 0.34f, 1f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 1.25f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
//    gl.glShadeModel(GL.GL_SMOOTH);
    }

    static void uranus(GL gl) {
        float amb[] = {0.2f, 0.34f, 1f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 0.625f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
//    gl.glShadeModel(GL.GL_SMOOTH);
    }

    static void meptune(GL gl) {
        float amb[] = {0.2f, 0.34f, 1f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 0.625f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
//    gl.glShadeModel(GL.GL_SMOOTH);
    }

    static void ring(GL gl) {
        int inner = 2;
        int outer = 3;
        int SLICES = 25;
        int LOOPS = 25;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluDisk(q, inner, outer, SLICES, LOOPS);
    }

    static void ring2(GL gl) {
        double inner = 2.48;
        double outer = 2.5;
        double inner2 = 3.98;
        double outer2 = 4;
        double inner3 = 5.98;
        double outer3 = 6;
        double inner4 = 7.98;
        double outer4 = 8;
        double inner5 = 17.98;
        double outer5 = 18;
        double inner6 = 27.98;
        double outer6 = 28;
        double inner7 = 17.98;
        double outer7 = 18;
        double inner8 = 27.98;
        double outer8 = 28;
        double inner9 = 37.98;
        double outer9 = 38;
        double inner10 = 47.98;
        double outer10 = 48;

        int SLICES = 25;
        int LOOPS = 25;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluDisk(q, inner, outer, SLICES, LOOPS);
        glu.gluDisk(q, inner2, outer2, 50, LOOPS);
        glu.gluDisk(q, inner3, outer3, 50, LOOPS);
        glu.gluDisk(q, inner4, outer4, 50, LOOPS);
        glu.gluDisk(q, inner5, outer5, 50, LOOPS);
        glu.gluDisk(q, inner6, outer6, 50, LOOPS);
        glu.gluDisk(q, inner7, outer7, 50, LOOPS);
        glu.gluDisk(q, inner8, outer8, 50, LOOPS);
        glu.gluDisk(q, inner9, outer9, 50, LOOPS);
        glu.gluDisk(q, inner10, outer10, 50, LOOPS);
    }

    static void moon(GL gl) {
        float amb[] = {0.34f, 0.34f, 0.34f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_DIFFUSE, diff, 0);

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK,
                GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK,
                GL.GL_SHININESS, shine);

        float BODY_RADIUS = 0.08f;

        int SLICES = 25;
        int STACKS = 25;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();

        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
//    gl.glShadeModel(GL.GL_SMOOTH);
    }

    static void solar(GL gl) {
//        float amb[] = {0.1f, 0f, 1, 1};
//        float diff[] = {0.1f, 0f, 1, 1};
//        float spec[] = {0.1f, 0f, 1, 1};
//        float shine = 0;
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_AMBIENT, amb, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_DIFFUSE, diff, 0);
//        gl.glMaterialfv(GL.GL_FRONT, GL.GL_SPECULAR, spec, 0);
//        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);

        gl.glPushMatrix();
        gl.glRotatef(angle, 0, 1f, 0f);
        Objek.sun(gl);           // Matahari
        gl.glRotatef(mercur, 0, 1, 0f);
        gl.glTranslatef(2.5f, 0, 0);
        Objek.mercury(gl);      // Merkurius
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glRotatef(venus, 0, 1f, 0f);
        gl.glTranslatef(4f, 0, 0);
        Objek.venus(gl);    //Venus
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glRotatef(angle, 0, 1f, 0f);
        gl.glTranslatef(6f, 0, 0);
        gl.glRotatef(angle, 0, 1, 0.3f);
        Objek.earth(gl);  //--------------Bumii
        gl.glPushMatrix();
        gl.glRotatef(angle2, 0f, 1f, 0f);
        gl.glTranslatef(-0.7f, 0, 0);
        Objek.moon(gl);
        gl.glPopMatrix();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glRotatef(mars, 0, 1f, 0f);
        gl.glTranslatef(8f, 0, 0);
        Objek.mars(gl);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glRotatef(jupiter, 0f, 1f, 0f);
        gl.glTranslatef(18f, 0, 0);
        Objek.jupiter(gl);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glRotatef(saturn, 0f, 1f, 0f);
        gl.glTranslatef(28f, 0, 0);
        Objek.saturn(gl);
        gl.glRotatef(ring, 1f, 0f, 0f);
        Objek.ring(gl);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glRotatef(ring, 1, 0, 0);
        Objek.ring2(gl);
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glRotatef(uranus, 0f, 1f, 0f);
        gl.glTranslatef(38f, 0, 0);
        Objek.saturn(gl);
        gl.glPopMatrix();
        gl.glPopMatrix();
        gl.glPushMatrix();
        gl.glRotatef(neptune, 0f, 1f, 0f);
        gl.glTranslatef(48f, 0, 0);
        Objek.saturn(gl);
        gl.glPopMatrix();

        angle2 += direction2;
        angle += direction;
        mercur += direction3;
        venus += direction4;
        mars += direction5;
        jupiter += direction6;
        saturn += direction7;
        uranus += direction8;
        neptune += direction9;
    }
}
