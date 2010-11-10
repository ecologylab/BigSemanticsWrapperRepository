using System;
using System.Collections.Generic;
using ecologylab.attributes;
using ecologylab.semantics.generated.library.products;
using ecologylab.semantics.generated.library.misc;
using ecologylab.semantics.generated.library.urbanspoon;
using ecologylab.semantics.generated.library.uva;
using ecologylab.semantics.generated.library.imdb;
using ecologylab.semantics.generated.library.flickr;
using ecologylab.semantics.generated.library.scholarlyPublication;
using ecologylab.semantics.generated.library.buzz;
using ecologylab.semantics.generated.library.rss;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.generated.library.fastflip;
using ecologylab.semantics.generated.library;
using ecologylab.semantics.generated.library.slashdot;
using ecologylab.semantics.generated.library.opml;
using ecologylab.semantics.generated.library.icdl;
using ecologylab.semantics.metadata;
using ecologylab.semantics.generated.library.bibManaging;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.generated.library.nsdl;
using ecologylab.semantics.metadata.builtins;

//developer should modify the namespace
//by default it falls into ecologylab.serialization
namespace ecologylab.serialization 
{
	public class GeneratedMetadataTranslations
	{
		public GeneratedMetadataTranslations()
		{ }

		public static TranslationScope Get()
		{
			return TranslationScope.Get("generated_metadata_translations",
				typeof(IcdlImage),
				typeof(Search),
				typeof(Model),
				typeof(Channel),
				typeof(Dc),
				typeof(GooglePatent),
				typeof(NsdlDocument),
				typeof(FlickrImage),
				typeof(DcDocument),
				typeof(Item),
				typeof(SlashdotArticle),
				typeof(FlickrLink),
				typeof(Thumbinner),
				typeof(CiteseerxSearch),
				typeof(MmArtwork),
				typeof(SlashdotRss),
				typeof(GoogleImageSearchPage),
				typeof(FlickrTags),
				typeof(FlickrSearch),
				typeof(Nsdl),
				typeof(CastMember),
				typeof(ImageInSearchResult),
				typeof(ImdbTitle),
				typeof(Rss22),
				typeof(Metadata),
				typeof(FlickrGroups),
				typeof(Pdf),
				typeof(Bookmark),
				typeof(Book),
				typeof(FlickrTagsInteresting),
				typeof(HotSearch),
				typeof(DebugMetadata),
				typeof(Author),
				typeof(WikipediaPageType),
				typeof(BirthDetail),
				typeof(ImdbChart),
				typeof(Header),
				typeof(Image),
				typeof(Topic),
				typeof(SlashdotTag),
				typeof(BingSearch),
				typeof(ImdbGenre),
				typeof(DocumentSet),
				typeof(MediaContent),
				typeof(DeliciousHomepage),
				typeof(KeywordSet),
				typeof(Response),
				typeof(NsdlService),
				typeof(CiteseerxRecord),
				typeof(CiteseerxSimilar),
				typeof(FlickrTag),
				typeof(ImageResult),
				typeof(SlashdotItem),
				typeof(PersonDetails),
				typeof(Rss),
				typeof(FlickrImageDetailTwo),
				typeof(YahooResultSet),
				typeof(BingWebSearchResult),
				typeof(FlickrSearchTwo),
				typeof(Thumbnail),
				typeof(WikipediaPageForParsing),
				typeof(Paragraph),
				typeof(AuthorPhotos),
				typeof(YahooMediaRss),
				typeof(GoogleSorry),
				typeof(Tag),
				typeof(SearchResult),
				typeof(WeatherReport),
				typeof(Genre),
				typeof(FlickrAuthor),
				typeof(Opml),
				typeof(ScholarlyArticle),
				typeof(Body),
				typeof(Head),
				typeof(Product),
				typeof(BingImageSearchResult),
				typeof(Artwork),
				typeof(GoogleTrends),
				typeof(TopicCluster),
				typeof(YahooThumbnail),
				typeof(Source),
				typeof(Anchor),
				typeof(CiteseerxSummary),
				typeof(ClippableDocument),
				typeof(Outline),
				typeof(Dlms),
				typeof(Entity),
				typeof(YahooResult),
				typeof(Lolz),
				typeof(Tumblr),
				typeof(FastflipSearch),
				typeof(GooglePatentImage),
				typeof(BingSearchWebSection),
				typeof(WikipediaPage),
				typeof(Surrogate),
				typeof(Document),
				typeof(AcmProceeding),
				typeof(Icdl),
				typeof(UrbanSpoonGenre),
				typeof(Text),
				typeof(Category),
				typeof(Restaurant),
				typeof(BingSearchImageSection),
				typeof(FlickrImageDetail),
				typeof(GoogleImageSearchType),
				typeof(SearchResults),
				typeof(Surrogate),
				typeof(Text),
				typeof(Document),
				typeof(DebugMetadata),
				typeof(Image),
				typeof(ClippableDocument),
				typeof(Metadata),
				typeof(Entity));
		}
	}
}
