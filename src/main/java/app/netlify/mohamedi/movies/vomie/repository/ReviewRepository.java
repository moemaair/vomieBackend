package app.netlify.mohamedi.movies.vomie.repository;

import app.netlify.mohamedi.movies.vomie.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ReviewRepository extends MongoRepository<Review, ObjectId>{

}
