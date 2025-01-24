package forestry.core;

public class ForestryColors {
	public static final int WHITE = 0xffffff;
	public static final int GRAY = 0x808080;
	public static final int DARK_GRAY = 0x404040;
	public static final int BLACK = 0x000000;

	public static int color(int r, int g, int b) {
		return (0xff << 24) | ((r & 0xff) << 16) | ((g & 0xff) << 8) | (b & 0xff);
	}
}
