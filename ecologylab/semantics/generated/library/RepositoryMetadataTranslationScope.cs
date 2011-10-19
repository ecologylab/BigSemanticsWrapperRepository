
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metametadata;


using ecologylab.semantics.generated.library;
using ecologylab.semantics.generated.library.artwork;
using ecologylab.semantics.generated.library.bibManaging;
using ecologylab.semantics.generated.library.british_cartoon_archive;
using ecologylab.semantics.generated.library.buzz;
using ecologylab.semantics.generated.library.camera;
using ecologylab.semantics.generated.library.creativeWork;
using ecologylab.semantics.generated.library.dlese;
using ecologylab.semantics.generated.library.fastflip;
using ecologylab.semantics.generated.library.flickr;
using ecologylab.semantics.generated.library.gaurdian_comic;
using ecologylab.semantics.generated.library.globe_cartoon;
using ecologylab.semantics.generated.library.googleBooks;
using ecologylab.semantics.generated.library.gps;
using ecologylab.semantics.generated.library.hotel;
using ecologylab.semantics.generated.library.icdl;
using ecologylab.semantics.generated.library.imdb;
using ecologylab.semantics.generated.library.misc;
using ecologylab.semantics.generated.library.nsdl;
using ecologylab.semantics.generated.library.opml;
using ecologylab.semantics.generated.library.patents;
using ecologylab.semantics.generated.library.political_cartoon;
using ecologylab.semantics.generated.library.products;
using ecologylab.semantics.generated.library.publication;
using ecologylab.semantics.generated.library.rss;
using ecologylab.semantics.generated.library.scholarlyPublication;
using ecologylab.semantics.generated.library.scienceDirect;
using ecologylab.semantics.generated.library.search;
using ecologylab.semantics.generated.library.sfu_cartoon_archive;
using ecologylab.semantics.generated.library.slashdot;
using ecologylab.semantics.generated.library.truman_library_1948_campaign_cartoons;
using ecologylab.semantics.generated.library.urbanspoon;
using ecologylab.semantics.generated.library.uva;
using ecologylab.semantics.generated.library.wikipedia;


// Developer should proof-read this SimplTypesScope before using it for production.
namespace ecologylab.semantics.generated.library 
{
	public class RepositoryMetadataTranslationScope
	{
		public RepositoryMetadataTranslationScope()
		{ }

		public static SimplTypesScope Get()
		{
			return SimplTypesScope.Get("meta-metadata-compiler-tscope", MetadataBuiltinsTranslationScope.Get(),
				typeof(DleseUserSearch),
				typeof(ImdbTitle),
				typeof(FlickrTags),
				typeof(Dc),
				typeof(Topic),
				typeof(AmazonBook),
				typeof(WikipediaPage),
				typeof(CiteseerxSearchResult),
				typeof(YahooGeoCode),
				typeof(GoogleScholarSearchResult),
				typeof(FastflipSearch),
				typeof(MomaArtwork),
				typeof(PoliticalCartoon),
				typeof(YahooThumbnail),
				typeof(IcdlBookPreview),
				typeof(Nsdl),
				typeof(SocialMediaSearchResult),
				typeof(GooglePatent),
				typeof(ContactPoint),
				typeof(YahooMediaRss),
				typeof(BingSearchWebSection),
				typeof(WeatherReport),
				typeof(Restaurant),
				typeof(GisLocation),
				typeof(CiteseerxRecord),
				typeof(IcdlImageResult),
				typeof(FlickrImageDetail),
				typeof(PostalAddress),
				typeof(GoogleTrends),
				typeof(TrumanLibrary1948CampaignCartoons),
				typeof(BingSearchImageSection),
				typeof(Channel),
				typeof(FlickrImageDetailTwo),
				typeof(MediaClipping),
				typeof(ClippableDocument),
				typeof(FlickrSearchTwo),
				typeof(DocumentSet),
				typeof(TextClipping),
				typeof(FlickrLink),
				typeof(Annotation),
				typeof(Clipping),
				typeof(DcDocument),
				typeof(DocumentMetadataWrap),
				typeof(BirthDetail),
				typeof(Tag),
				typeof(BingWebSearchResult),
				typeof(Rss22),
				typeof(Author),
				typeof(Rss),
				typeof(CompoundDocument),
				typeof(GaurdianComic),
				typeof(AcmPortalSearch),
				typeof(ImdbGenre),
				typeof(CiteseerxSummary),
				typeof(NsdlService),
				typeof(GoogleScholarSearch),
				typeof(Thumbnail),
				typeof(SlashdotArticle),
				typeof(CitationInfo),
				typeof(Patent),
				typeof(DleseGetRecord),
				typeof(YahooResultSet),
				typeof(Lolz),
				typeof(GoogleBook),
				typeof(ImageClipping),
				typeof(AmazonProduct),
				typeof(SlashdotTag),
				typeof(CreativeWork),
				typeof(PersonDetails),
				typeof(Book),
				typeof(Document),
				typeof(Publisher),
				typeof(ScienceDirectArticle),
				typeof(Opml),
				typeof(BritishCartoonArchive),
				typeof(FlickrGroups),
				typeof(TumblrSearch),
				typeof(Model),
				typeof(Image),
				typeof(GoogleSorry),
				typeof(BingImageSearchResult),
				typeof(Search),
				typeof(FlickrSearch),
				typeof(BasicPublication),
				typeof(ImageInSearchResult),
				typeof(SlashdotSearch),
				typeof(Tumblr),
				typeof(SlashdotItem),
				typeof(SlashdotRss),
				typeof(Metadata),
				typeof(Artist),
				typeof(NsdlDocument),
				typeof(FlickrNearby),
				typeof(GlobeCartoon),
				typeof(FlickrAuthor),
				typeof(DebugMetadata),
				typeof(SearchResult),
				typeof(GoogleImageSearchPage),
				typeof(UrbanSpoonGenre),
				typeof(BingSearch),
				typeof(DeliciousSearch),
				typeof(CameraSettings),
				typeof(WikipediaPageType),
				typeof(PdfMixin),
				typeof(SfuCartoonArchive),
				typeof(ScholarlyArticle),
				typeof(GoogleImageSearchType),
				typeof(Artwork),
				typeof(TopicCluster),
				typeof(IcdlImage),
				typeof(Product),
				typeof(Item),
				typeof(Dlms),
				typeof(AcmPortalSearchResult),
				typeof(Hotel),
				typeof(AuthorPhotos),
				typeof(MmArtwork),
				typeof(FlickrTag),
				typeof(Publication),
				typeof(FlickrTagsInteresting),
				typeof(ImdbChart),
				typeof(DeliciousHomepage),
				typeof(CiteseerxSearch),
				typeof(Periodical),
				typeof(KeywordSet)
			);
		}
	}
}
