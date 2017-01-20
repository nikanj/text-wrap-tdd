public class Wrap {

	public String wrap(final String s, final int l) {

		if (s.length() > l) {

			int splitAt = s.lastIndexOf(" ", l);

			if (splitAt == -1) {
				splitAt = l;
			}

			return s.substring(0, splitAt).trim() + "\n" + wrap(s.substring(splitAt).trim(), l);
		} else {
			return s;
		}
	}

}
