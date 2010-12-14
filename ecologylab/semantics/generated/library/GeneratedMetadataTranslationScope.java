package ecologylab.semantics.generated.library;

/**
	

This is a generated code. DO NOT edit or modify it.
@author MetadataCompiler
*/

import ecologylab.generic.HashMapArrayList;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.library.*;
import ecologylab.semantics.generated.library.bibManaging.*;
import ecologylab.semantics.generated.library.buzz.*;
import ecologylab.semantics.generated.library.fastflip.*;
import ecologylab.semantics.generated.library.flickr.*;
import ecologylab.semantics.generated.library.icdl.*;
import ecologylab.semantics.generated.library.imdb.*;
import ecologylab.semantics.generated.library.misc.*;
import ecologylab.semantics.generated.library.nsdl.*;
import ecologylab.semantics.generated.library.opml.*;
import ecologylab.semantics.generated.library.products.*;
import ecologylab.semantics.generated.library.rss.*;
import ecologylab.semantics.generated.library.scholarlyPublication.*;
import ecologylab.semantics.generated.library.scienceDirect.*;
import ecologylab.semantics.generated.library.search.*;
import ecologylab.semantics.generated.library.slashdot.*;
import ecologylab.semantics.generated.library.urbanspoon.*;
import ecologylab.semantics.generated.library.uva.*;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.builtins.*;
import ecologylab.semantics.metadata.builtins.Clipping;
import ecologylab.semantics.metadata.builtins.DebugMetadata;
import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.builtins.Entity;
import ecologylab.semantics.metadata.builtins.Image;
import ecologylab.semantics.metadata.builtins.Surrogate;
import ecologylab.semantics.metadata.builtins.Text;
import ecologylab.semantics.metadata.scalar.*;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.semantics.metametadata.MetaMetadataRepository;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.serialization.Hint;
import ecologylab.serialization.TranslationScope;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.types.element.Mappable;
import java.util.*;


/**
	
This is the tranlation scope class for generated files.

*/
public class GeneratedMetadataTranslationScope
{
	protected static final Class TRANSLATIONS[] =
	{
		ecologylab.semantics.generated.library.Pdf.class,

		ecologylab.semantics.generated.library.scholarlyPublication.AcmProceeding.class,

		ecologylab.semantics.generated.library.MmArtwork.class,

		ecologylab.semantics.generated.library.Artwork.class,

		ecologylab.semantics.generated.library.buzz.HotSearch.class,

		ecologylab.semantics.generated.library.buzz.GoogleTrends.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxRecord.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxSimilar.class,

		ecologylab.semantics.generated.library.bibManaging.CitationInfo.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxSearch.class,

		ecologylab.semantics.generated.library.bibManaging.CiteseerxSummary.class,

		ecologylab.semantics.generated.library.Bookmark.class,

		ecologylab.semantics.generated.library.DeliciousHomepage.class,

		ecologylab.semantics.generated.library.fastflip.Thumbnail.class,

		ecologylab.semantics.generated.library.fastflip.FastflipSearch.class,

		ecologylab.semantics.generated.library.flickr.FlickrImageDetail.class,

		ecologylab.semantics.generated.library.flickr.FlickrTag.class,

		ecologylab.semantics.generated.library.flickr.FlickrSearchTwo.class,

		ecologylab.semantics.generated.library.flickr.FlickrTags.class,

		ecologylab.semantics.generated.library.flickr.FlickrImageDetailTwo.class,

		ecologylab.semantics.generated.library.flickr.FlickrSearch.class,

		ecologylab.semantics.generated.library.flickr.FlickrLink.class,

		ecologylab.semantics.generated.library.flickr.FlickrTagsInteresting.class,

		ecologylab.semantics.generated.library.flickr.FlickrGroups.class,

		ecologylab.semantics.generated.library.flickr.FlickrImage.class,

		ecologylab.semantics.generated.library.flickr.FlickrAuthor.class,

		ecologylab.semantics.generated.library.flickr.AuthorPhotos.class,

		ecologylab.semantics.generated.library.Chapter.class,

		ecologylab.semantics.generated.library.Term.class,

		ecologylab.semantics.generated.library.Subject.class,

		ecologylab.semantics.generated.library.GoogleBook.class,

		ecologylab.semantics.generated.library.GoogleImageSearchPage.class,

		ecologylab.semantics.generated.library.ImageResult.class,

		ecologylab.semantics.generated.library.GoogleImageSearchType.class,

		ecologylab.semantics.generated.library.GooglePatent.class,

		ecologylab.semantics.generated.library.GoogleSorry.class,

		ecologylab.semantics.generated.library.GooglePatentImage.class,

		ecologylab.semantics.generated.library.icdl.Book.class,

		ecologylab.semantics.generated.library.icdl.Response.class,

		ecologylab.semantics.generated.library.icdl.Icdl.class,

		ecologylab.semantics.generated.library.imdb.PersonDetails.class,

		ecologylab.semantics.generated.library.imdb.Genre.class,

		ecologylab.semantics.generated.library.imdb.CastMember.class,

		ecologylab.semantics.generated.library.imdb.ImdbTitle.class,

		ecologylab.semantics.generated.library.imdb.ImdbGenre.class,

		ecologylab.semantics.generated.library.imdb.ImdbChart.class,

		ecologylab.semantics.generated.library.imdb.BirthDetail.class,

		ecologylab.semantics.generated.library.Lolz.class,

		ecologylab.semantics.generated.library.misc.DcDocument.class,

		ecologylab.semantics.generated.library.misc.IcdlImage.class,

		ecologylab.semantics.generated.library.misc.Dlms.class,

		ecologylab.semantics.generated.library.misc.Nsdl.class,

		ecologylab.semantics.generated.library.opml.Head.class,

		ecologylab.semantics.generated.library.opml.Outline.class,

		ecologylab.semantics.generated.library.opml.Outline.class,

		ecologylab.semantics.generated.library.opml.Body.class,

		ecologylab.semantics.generated.library.opml.Opml.class,

		ecologylab.semantics.generated.library.products.Product.class,

		ecologylab.semantics.generated.library.Restaurant.class,

		ecologylab.semantics.generated.library.rss.Dc.class,

		ecologylab.semantics.generated.library.rss.Rss22.class,

		ecologylab.semantics.generated.library.rss.Item.class,

		ecologylab.semantics.generated.library.rss.MediaContent.class,

		ecologylab.semantics.generated.library.rss.YahooMediaRss.class,

		ecologylab.semantics.generated.library.rss.Channel.class,

		ecologylab.semantics.generated.library.rss.Rss.class,

		ecologylab.semantics.generated.library.scholarlyPublication.Tag.class,

		ecologylab.semantics.generated.library.scholarlyPublication.Tag.class,

		ecologylab.semantics.generated.library.scholarlyPublication.ScholarlyArticle.class,

		ecologylab.semantics.generated.library.scholarlyPublication.Author.class,

		ecologylab.semantics.generated.library.scholarlyPublication.Source.class,

		ecologylab.semantics.generated.library.scienceDirect.ScienceDirectArticle.class,

		ecologylab.semantics.generated.library.search.ImageInSearchResult.class,

		ecologylab.semantics.generated.library.search.BingSearch.class,

		ecologylab.semantics.generated.library.search.YahooResult.class,

		ecologylab.semantics.generated.library.search.GoogleScholarSearchResult.class,

		ecologylab.semantics.generated.library.search.BingWebSearchResult.class,

		ecologylab.semantics.generated.library.search.YahooThumbnail.class,

		ecologylab.semantics.generated.library.search.YahooResultSet.class,

		ecologylab.semantics.generated.library.search.Search.class,

		ecologylab.semantics.generated.library.search.BingImageSearchResult.class,

		ecologylab.semantics.generated.library.search.SearchResult.class,

		ecologylab.semantics.generated.library.search.BingSearchWebSection.class,

		ecologylab.semantics.generated.library.search.GoogleScholarSearch.class,

		ecologylab.semantics.generated.library.search.BingSearchImageSection.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotRss.class,

		ecologylab.semantics.generated.library.slashdot.Anchor.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotArticle.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotItem.class,

		ecologylab.semantics.generated.library.slashdot.SlashdotTag.class,

		ecologylab.semantics.generated.library.Tumblr.class,

		ecologylab.semantics.generated.library.WeatherReport.class,

		ecologylab.semantics.generated.library.WikipediaPage.class,

		ecologylab.semantics.generated.library.Anchor.class,

		ecologylab.semantics.generated.library.Paragraph.class,

		ecologylab.semantics.generated.library.Category.class,

		ecologylab.semantics.generated.library.Thumbinner.class,

		ecologylab.semantics.generated.library.WikipediaPageType.class,

		ecologylab.semantics.generated.library.WikipediaPageForParsing.class,

		ecologylab.semantics.generated.library.nsdl.Header.class,

		ecologylab.semantics.generated.library.nsdl.NsdlDocument.class,

		ecologylab.semantics.generated.library.nsdl.SearchResults.class,

		ecologylab.semantics.generated.library.nsdl.NsdlService.class,

		ecologylab.semantics.generated.library.urbanspoon.UrbanSpoonGenre.class,

		ecologylab.semantics.generated.library.uva.Topic.class,

		ecologylab.semantics.generated.library.uva.Model.class,

		ecologylab.semantics.generated.library.uva.TopicCluster.class,

		ecologylab.semantics.generated.library.uva.DocumentSet.class,

		ecologylab.semantics.generated.library.uva.KeywordSet.class,


};
 
public static TranslationScope get()
{
return TranslationScope.get("generated_metadata_translations", MetadataBuiltinsTranslationScope.get(), TRANSLATIONS);
}
}