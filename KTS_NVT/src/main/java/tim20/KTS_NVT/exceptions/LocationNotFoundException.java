package tim20.KTS_NVT.exceptions;

public class LocationNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private long locationId;

	public LocationNotFoundException(long locationId) {
		this.locationId = locationId;
	}

	public long getLocationId() {
		return locationId;
	}

}
