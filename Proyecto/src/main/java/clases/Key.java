package clases;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class Key {

	private File note;
	private BufferedImage keyImage;

	public File getNote() {
		return note;
	}

	public void setNote(File note) {
		this.note = note;
	}

	public BufferedImage getKeyImage() {
		return keyImage;
	}

	public void setKeyImage(BufferedImage keyImage) {
		this.keyImage = keyImage;
	}

	public Key(File note, BufferedImage keyImage) {
		super();
		this.note = note;
		this.keyImage = keyImage;
	}

	public Key() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Key> getPianoKeys() throws IOException {
		ArrayList<Key> pianoKeys = new ArrayList<>();
		BufferedImage whiteKeyImage = ImageIO.read(new File("keys/images/white_tile.png"));
		BufferedImage blackKeyImage = ImageIO.read(new File("keys/images/black_tile.png"));

		Key a0 = new Key(new File("keys/clips/0-a.wav"), whiteKeyImage);

		Key as0 = new Key(new File("keys/clips/0-as.wav"), blackKeyImage);

		Key b0 = new Key(new File("keys/clips/0-b.wav"), whiteKeyImage);

		Key c1 = new Key(new File("keys/clips/1-c.wav"), whiteKeyImage);

		Key cs1 = new Key(new File("keys/clips/1-cs.wav"), blackKeyImage);

		Key d1 = new Key(new File("keys/clips/1-d.wav"), whiteKeyImage);

		Key ds1 = new Key(new File("keys/clips/1-ds.wav"), blackKeyImage);

		Key e1 = new Key(new File("keys/clips/1-e.wav"), whiteKeyImage);

		Key f1 = new Key(new File("keys/clips/1-f.wav"), whiteKeyImage);

		Key fs1 = new Key(new File("keys/clips/1-fs.wav"), blackKeyImage);

		Key g1 = new Key(new File("keys/clips/1-g.wav"), whiteKeyImage);

		Key gs1 = new Key(new File("keys/clips/1-gs.wav"), blackKeyImage);

		Key a1 = new Key(new File("keys/clips/1-a.wav"), whiteKeyImage);

		Key as1 = new Key(new File("keys/clips/1-as.wav"), blackKeyImage);

		Key b1 = new Key(new File("keys/clips/1-b.wav"), whiteKeyImage);

		Key c2 = new Key(new File("keys/clips/2-c.wav"), whiteKeyImage);

		Key cs2 = new Key(new File("keys/clips/2-cs.wav"), blackKeyImage);

		Key d2 = new Key(new File("keys/clips/2-d.wav"), whiteKeyImage);

		Key ds2 = new Key(new File("keys/clips/2-ds.wav"), blackKeyImage);

		Key e2 = new Key(new File("keys/clips/2-e.wav"), whiteKeyImage);

		Key f2 = new Key(new File("keys/clips/2-f.wav"), whiteKeyImage);

		Key fs2 = new Key(new File("keys/clips/2-fs.wav"), blackKeyImage);

		Key g2 = new Key(new File("keys/clips/2-g.wav"), whiteKeyImage);

		Key gs2 = new Key(new File("keys/clips/2-gs.wav"), blackKeyImage);

		Key a2 = new Key(new File("keys/clips/2-a.wav"), whiteKeyImage);

		Key as2 = new Key(new File("keys/clips/2-as.wav"), blackKeyImage);

		Key b2 = new Key(new File("keys/clips/2-b.wav"), whiteKeyImage);

		Key c3 = new Key(new File("keys/clips/3-c.wav"), whiteKeyImage);

		Key cs3 = new Key(new File("keys/clips/3-cs.wav"), blackKeyImage);

		Key d3 = new Key(new File("keys/clips/3-d.wav"), whiteKeyImage);

		Key ds3 = new Key(new File("keys/clips/3-ds.wav"), blackKeyImage);

		Key e3 = new Key(new File("keys/clips/3-e.wav"), whiteKeyImage);

		Key f3 = new Key(new File("keys/clips/3-f.wav"), whiteKeyImage);

		Key fs3 = new Key(new File("keys/clips/3-fs.wav"), blackKeyImage);

		Key g3 = new Key(new File("keys/clips/3-g.wav"), whiteKeyImage);

		Key gs3 = new Key(new File("keys/clips/3-gs.wav"), blackKeyImage);

		Key a3 = new Key(new File("keys/clips/3-a.wav"), whiteKeyImage);

		Key as3 = new Key(new File("keys/clips/3-as.wav"), blackKeyImage);

		Key b3 = new Key(new File("keys/clips/3-b.wav"), whiteKeyImage);

		Key c4 = new Key(new File("keys/clips/4-c.wav"), whiteKeyImage);

		Key cs4 = new Key(new File("keys/clips/4-cs.wav"), blackKeyImage);

		Key d4 = new Key(new File("keys/clips/4-d.wav"), whiteKeyImage);

		Key ds4 = new Key(new File("keys/clips/4-ds.wav"), blackKeyImage);

		Key e4 = new Key(new File("keys/clips/4-e.wav"), whiteKeyImage);

		Key f4 = new Key(new File("keys/clips/4-f.wav"), whiteKeyImage);

		Key fs4 = new Key(new File("keys/clips/4-fs.wav"), blackKeyImage);

		Key g4 = new Key(new File("keys/clips/4-g.wav"), whiteKeyImage);

		Key gs4 = new Key(new File("keys/clips/4-gs.wav"), blackKeyImage);
		
		Key a4 = new Key(new File("keys/clips/4-a.wav"), whiteKeyImage);
		
		Key as4 = new Key(new File("keys/clips/4-as.wav"), blackKeyImage);
		
		Key b4 = new Key(new File("keys/clips/4-b.wav"), whiteKeyImage);
		
		Key c5 = new Key(new File("keys/clips/5-c.wav"), whiteKeyImage);
		
		Key cs5 = new Key(new File("keys/clips/5-cs.wav"), blackKeyImage);
		
		Key d5 = new Key(new File("keys/clips/5-d.wav"), whiteKeyImage);

		Key ds5 = new Key(new File("keys/clips/5-ds.wav"), blackKeyImage);
		
		Key e5 = new Key(new File("keys/clips/5-e.wav"), whiteKeyImage);
		
		Key f5 = new Key(new File("keys/clips/5-f.wav"), whiteKeyImage);
		
		Key fs5 = new Key(new File("keys/clips/5-fs.wav"), blackKeyImage);
		
		Key g5 = new Key(new File("keys/clips/5-g.wav"), whiteKeyImage);
		
		Key gs5 = new Key(new File("keys/clips/5-gs.wav"), blackKeyImage);

		Key a5 = new Key(new File("keys/clips/5-a.wav"), whiteKeyImage);

		Key as5 = new Key(new File("keys/clips/5-as.wav"), blackKeyImage);

		Key b5 = new Key(new File("keys/clips/5-b.wav"), whiteKeyImage);
		
		Key c6 = new Key(new File("keys/clips/6-c.wav"), whiteKeyImage);
		
		Key cs6 = new Key(new File("keys/clips/6-cs.wav"), blackKeyImage);

		Key d6 = new Key(new File("keys/clips/6-d.wav"), whiteKeyImage);

		Key ds6 = new Key(new File("keys/clips/6-ds.wav"), blackKeyImage);
		
		Key e6 = new Key(new File("keys/clips/7-e.wav"), whiteKeyImage);
		
		Key f6 = new Key(new File("keys/clips/7-f.wav"), whiteKeyImage);
		
		Key fs6 = new Key(new File("keys/clips/7-fs.wav"), blackKeyImage);
		
		Key g6 = new Key(new File("keys/clips/7-g.wav"), whiteKeyImage);
		
		Key gs6 = new Key(new File("keys/clips/7-gs.wav"), blackKeyImage);
		
		Key a6 = new Key(new File("keys/clips/6-a.wav"), whiteKeyImage);

		Key as6 = new Key(new File("keys/clips/6-as.wav"), blackKeyImage);
		
		Key b6 = new Key(new File("keys/clips/6-b.wav"), whiteKeyImage);

		Key c7 = new Key(new File("keys/clips/7-c.wav"), whiteKeyImage);

		Key cs7 = new Key(new File("keys/clips/7-cs.wav"), blackKeyImage);

		Key d7 = new Key(new File("keys/clips/7-d.wav"), whiteKeyImage);

		Key ds7 = new Key(new File("keys/clips/7-ds.wav"), blackKeyImage);

		Key e7 = new Key(new File("keys/clips/7-e.wav"), whiteKeyImage);

		Key f7 = new Key(new File("keys/clips/7-f.wav"), whiteKeyImage);

		Key fs7 = new Key(new File("keys/clips/7-fs.wav"), blackKeyImage);

		Key g7 = new Key(new File("keys/clips/7-g.wav"), whiteKeyImage);

		Key gs7 = new Key(new File("keys/clips/7-gs.wav"), blackKeyImage);

		Key a7 = new Key(new File("keys/clips/7-a.wav"), whiteKeyImage);

		Key as7 = new Key(new File("keys/clips/7-as.wav"), blackKeyImage);

		Key b7 = new Key(new File("keys/clips/7-b.wav"), whiteKeyImage);

		Key c8 = new Key(new File("keys/clips/8-c.wav"), whiteKeyImage);
		
		pianoKeys.add(a0);
		pianoKeys.add(as0);
		pianoKeys.add(b0);
		pianoKeys.add(c1);
		pianoKeys.add(cs1);
		pianoKeys.add(d1);
		pianoKeys.add(ds1);
		pianoKeys.add(e1);
		pianoKeys.add(f1);
		pianoKeys.add(fs1);
		pianoKeys.add(g1);
		pianoKeys.add(gs1);
		pianoKeys.add(a1);
		pianoKeys.add(as1);
		pianoKeys.add(b1);
		pianoKeys.add(c2);
		pianoKeys.add(cs2);
		pianoKeys.add(d2);
		pianoKeys.add(ds2);
		pianoKeys.add(e2);
		pianoKeys.add(f2);
		pianoKeys.add(fs2);
		pianoKeys.add(g2);
		pianoKeys.add(gs2);
		pianoKeys.add(a2);
		pianoKeys.add(as2);
		pianoKeys.add(b2);
		pianoKeys.add(c3);
		pianoKeys.add(cs3);
		pianoKeys.add(d3);
		pianoKeys.add(ds3);
		pianoKeys.add(e3);
		pianoKeys.add(f3);
		pianoKeys.add(fs3);
		pianoKeys.add(g3);
		pianoKeys.add(gs3);
		pianoKeys.add(a3);
		pianoKeys.add(as3);
		pianoKeys.add(b3);
		pianoKeys.add(c4);
		pianoKeys.add(cs4);
		pianoKeys.add(d4);
		pianoKeys.add(ds4);
		pianoKeys.add(e4);
		pianoKeys.add(f4);
		pianoKeys.add(fs4);
		pianoKeys.add(g4);
		pianoKeys.add(a4);
		pianoKeys.add(as4);
		pianoKeys.add(b4);
		pianoKeys.add(c5);
		pianoKeys.add(cs5);
		pianoKeys.add(d5);
		pianoKeys.add(ds5);
		pianoKeys.add(e5);
		pianoKeys.add(f5);
		pianoKeys.add(fs5);
		pianoKeys.add(g5);
		pianoKeys.add(gs5);
		pianoKeys.add(a5);
		pianoKeys.add(as5);
		pianoKeys.add(b5);
		pianoKeys.add(c6);
		pianoKeys.add(cs6);
		pianoKeys.add(d6);
		pianoKeys.add(ds6);
		pianoKeys.add(e6);
		pianoKeys.add(f6);
		pianoKeys.add(fs6);
		pianoKeys.add(g6);
		pianoKeys.add(gs6);
		pianoKeys.add(a6);
		pianoKeys.add(as6);
		pianoKeys.add(b6);
		pianoKeys.add(c7);
		pianoKeys.add(cs7);
		pianoKeys.add(d7);
		pianoKeys.add(ds7);
		pianoKeys.add(e7);
		pianoKeys.add(f7);
		pianoKeys.add(fs7);
		pianoKeys.add(g7);
		pianoKeys.add(a7);
		pianoKeys.add(as7);
		pianoKeys.add(b7);
		pianoKeys.add(c8);

		return pianoKeys;
	}

}
