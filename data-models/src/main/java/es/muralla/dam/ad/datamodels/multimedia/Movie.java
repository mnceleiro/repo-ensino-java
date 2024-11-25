package es.muralla.dam.ad.datamodels.multimedia;

import java.time.LocalDate;
import java.util.List;

public record Movie (
	long id,
	String title,
	LocalDate releaseDate,
	int lengthMinutes,
	
	List<Actor> actors
) {
	
	public static class Builder {
		private long id;
		private String title;
		private LocalDate releaseDate;
		private int lengthMinutes;
		private List<Actor> actors;
		
		public Builder setId(long id) {
			this.id = id;
			return this;
		}
		
		public Builder setTitle(String title) {
			this.title = title;
			return this;
		}
		
		public Builder setReleaseDate(LocalDate releaseDate) {
			this.releaseDate = releaseDate;
			return this;
		}
		
		public Builder setLenthMinutes(int lengthMinutes) {
			this.lengthMinutes = lengthMinutes;
			return this;
		}
		
		public Builder addActor(Actor actor) {
			this.actors.add(actor);
			return this;
		}
		
		public Movie build() {
			return new Movie(
				id,
				title,
				releaseDate,
				lengthMinutes,
				actors
			);
		}
	}
}
