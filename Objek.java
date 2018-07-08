package org.yourorghere;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;
public class Objek {
    static float angle = 0f;
    static float angle2 = 0f;
    static float direction=1f;
    static float direction2=10f;
    
    static void Sun(GL gl)
    {
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
 
    float BODY_RADIUS=2f;

    int SLICES=25;
    int STACKS=25;
    GLU glu=new GLU();
    GLUquadric q=glu.gluNewQuadric();

    glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
//    gl.glShadeModel(GL.GL_SMOOTH);
    }
    
    
     static void earth(GL gl)
    {
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
 
    float BODY_RADIUS=0.5f;

    int SLICES=25;
    int STACKS=25;
    GLU glu=new GLU();
    GLUquadric q=glu.gluNewQuadric();

    glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    gl.glShadeModel(GL.GL_SMOOTH);
    }
     
     static void moon(GL gl)
    {
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
 
    float BODY_RADIUS=0.1f;

    int SLICES=25;
    int STACKS=25;
    GLU glu=new GLU();
    GLUquadric q=glu.gluNewQuadric();

    glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);

    }
    
    static void solar(GL gl) {

       
        gl.glTranslatef(0, 0, 0);
        Objek.Sun(gl);
        gl.glRotatef(angle, 0, 0.3f, 1);
        gl.glTranslatef(5, 0, 0);
        Objek.earth(gl);
        gl.glRotatef(angle2, 0f, 1f, 0f);
        gl.glTranslatef(-0.7f, 0, 0);
        Objek.moon(gl);
        
        angle2+=direction2;
        
        angle+=direction;
    }    
 }
