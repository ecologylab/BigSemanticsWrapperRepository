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
using ecologylab.semantics.generated.library.publication;
using ecologylab.semantics.generated.library.rss;
using ecologylab.semantics.metadata.scalar;
using ecologylab.semantics.generated.library.fastflip;
using ecologylab.semantics.generated.library;
using ecologylab.semantics.generated.library.slashdot;
using ecologylab.semantics.generated.library.scienceDirect;
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
				typeof(ProductReview),
				typeof(Item),
				typeof(SlashdotArticle),
				typeof(FlickrLink),
				typeof(Thumbinner),
				typeof(CiteseerxSearch),
				typeof(MmArtwork),
				typeof(GoogleImageSearchPage),
				typeof(SlashdotRss),
				typeof(FlickrTags),
				typeof(FlickrSearch),
				typeof(Nsdl),
				typeof(CastMember),
				typeof(Term),
				typeof(ImageInSearchResult),
				typeof(ImdbTitle),
				typeof(Rss22),
				typeof(Metadata),
				typeof(FlickrGroups),
				typeof(Pdf),
				typeof(Bookmark),
				typeof(Book),
				typeof(HotSearch),
				typeof(FlickrTagsInteresting),
				typeof(DebugMetadata),
				typeof(Author),
				typeof(WikipediaPageType),
				typeof(BirthDetail),
				typeof(IcdlImageResult),
				typeof(ImdbChart),
				typeof(LinkRun),
				typeof(Header),
				typeof(Image),
				typeof(Topic),
				typeof(SlashdotTag),
				typeof(BingSearch),
				typeof(ImdbGenre),
				typeof(DocumentSet),
				typeof(MediaContent),
				typeof(DeliciousHomepage),
				typeof(Subject),
				typeof(KeywordSet),
				typeof(TextRun),
				typeof(NsdlService),
				typeof(CiteseerxRecord),
				typeof(CiteseerxSimilar),
				typeof(FlickrTag),
				typeof(ImageResult),
				typeof(SlashdotItem),
				typeof(GoogleScholarSearchResult),
				typeof(PersonDetails),
				typeof(GoogleScholarSearch),
				typeof(Rss),
				typeof(FlickrImageDetailTwo),
				typeof(YahooResultSet),
				typeof(BingWebSearchResult),
				typeof(FlickrSearchTwo),
				typeof(WikipediaPageForParsing),
				typeof(Thumbnail),
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
				typeof(Product),
				typeof(Head),
				typeof(GoogleTrends),
				typeof(Artwork),
				typeof(BingImageSearchResult),
				typeof(TopicCluster),
				typeof(ClippableMetadata),
				typeof(YahooThumbnail),
				typeof(Source),
				typeof(Anchor),
				typeof(CiteseerxSummary),
				typeof(Outline),
				typeof(IcdlBookPreview),
				typeof(Dlms),
				typeof(YahooResult),
				typeof(Lolz),
				typeof(Tumblr),
				typeof(Clipping),
				typeof(FastflipSearch),
				typeof(GooglePatentImage),
				typeof(BingSearchWebSection),
				typeof(Chapter),
				typeof(CitationInfo),
				typeof(WikipediaPage),
				typeof(Run),
				typeof(Surrogate),
				typeof(Document),
				typeof(AcmProceeding),
				typeof(UrbanSpoonGenre),
				typeof(Text),
				typeof(Category),
				typeof(Restaurant),
				typeof(BingSearchImageSection),
				typeof(FlickrImageDetail),
				typeof(HypertextPara),
				typeof(GoogleImageSearchType),
				typeof(SearchResults),
				typeof(ScienceDirectArticle),
				typeof(GoogleBook),
				typeof(StyleInfo),
				typeof(Surrogate),
				typeof(Text),
				typeof(Document),
				typeof(DebugMetadata),
				typeof(ClippableMetadata),
				typeof(Image),
				typeof(Clipping),
				typeof(Metadata));
		}
	}
}
