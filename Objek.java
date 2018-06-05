package org.yourorghere;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
public class Objek {
    static float angle = 0f;
    static float direction=1f;
    static void Sun(GL gl)
    {
    float BODY_RADIUS=1f;

    int SLICES=50;
    int STACKS=50;
    GLU glu=new GLU();
    GLUquadric q=glu.gluNewQuadric();

    glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
//    gl.glShadeModel(GL.GL_SMOOTH);
    }
    
    static void earth(GL gl)
    {
    gl.glTranslatef(5f, 0f, 0f);
    gl.glRotatef(angle, 0, 1, 1);
    float BODY_RADIUS=0.4f;

    int SLICES=30;
    int STACKS=30;
    GLU glu=new GLU();
    GLUquadric q=glu.gluNewQuadric();

    glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    angle += direction;
    }
}
