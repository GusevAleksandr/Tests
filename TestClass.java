 package tests;


public class TestClass {

	private InstanceListener[] listeners = new InstanceListener[0];

	public void addInstanceListener(InstanceListener listener) {

		synchronized (listeners) {
			InstanceListener[] results = new InstanceListener[listeners.length + 1];

			for (int i = 0; i < listeners.length; i++) {
				results[i] = listeners[i];
			}

			results[listeners.length] = listener;
			listeners = results;
		}
	}

	static class InstanceListener {
		//...
	}
}
