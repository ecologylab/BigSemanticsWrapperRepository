
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;
using ecologylab.collections;
using ecologylab.semantics.metadata.builtins;
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

// Developer should proof-read this TranslationScope before using it for production.
namespace ecologylab.semantics.generated.library 
{
	public class RepositoryMetadataTranslationScope
	{
		public RepositoryMetadataTranslationScope()
		{ }

		public static SimplTypesScope Get()
		{
			return SimplTypesScope.Get("meta-metadata-compiler-tscope", MetadataBuiltinsTranslationScope.Get(),
				typeof(PdfMixin),
				typeof(Tag),
				typeof(AcmPortalSearchResult),
				typeof(AcmPortalSearch),
				typeof(MmArtwork),
				typeof(Artist),
				typeof(MomaArtwork),
				typeof(Artwork),
				typeof(GoogleTrends),
				typeof(CameraSettings),
				typeof(CiteseerxRecord),
				typeof(CitationInfo),
				typeof(CiteseerxSearch),
				typeof(CiteseerxSearchResult),
				typeof(CiteseerxSummary),
				typeof(Author),
				typeof(BasicPublication),
				typeof(CreativeWork),
				typeof(Periodical),
				typeof(DeliciousHomepage),
				typeof(Thumbnail),
				typeof(FastflipSearch),
				typeof(FlickrGroups),
				typeof(FlickrImageDetail),
				typeof(FlickrTag),
				typeof(FlickrSearchTwo),
				typeof(FlickrTags),
				typeof(FlickrImageDetailTwo),
				typeof(FlickrAuthor),
				typeof(AuthorPhotos),
				typeof(FlickrNearby),
				typeof(FlickrSearch),
				typeof(FlickrTagsInteresting),
				typeof(FlickrLink),
				typeof(GisLocation),
				typeof(ContactPoint),
				typeof(PostalAddress),
				typeof(GoogleBook),
				typeof(GoogleImageSearchPage),
				typeof(GoogleImageSearchType),
				typeof(Hotel),
				typeof(IcdlBookPreview),
				typeof(IcdlImageResult),
				typeof(PersonDetails),
				typeof(ImdbTitle),
				typeof(ImdbGenre),
				typeof(ImdbChart),
				typeof(BirthDetail),
				typeof(Lolz),
				typeof(DcDocument),
				typeof(IcdlImage),
				typeof(Dlms),
				typeof(Nsdl),
				typeof(Opml),
				typeof(GooglePatent),
				typeof(GoogleSorry),
				typeof(Patent),
				typeof(Product),
				typeof(AmazonProduct),
				typeof(AmazonBook),
				typeof(Book),
				typeof(Publisher),
				typeof(Publication),
				typeof(Restaurant),
				typeof(Dc),
				typeof(Rss22),
				typeof(Item),
				typeof(YahooMediaRss),
				typeof(Rss),
				typeof(Channel),
				typeof(ScholarlyArticle),
				typeof(ScienceDirectArticle),
				typeof(ImageInSearchResult),
				typeof(YahooGeoCode),
				typeof(TumblrSearch),
				typeof(BingSearch),
				typeof(GoogleScholarSearchResult),
				typeof(BingWebSearchResult),
				typeof(YahooThumbnail),
				typeof(YahooResultSet),
				typeof(Search),
				typeof(BingImageSearchResult),
				typeof(SearchResult),
				typeof(BingSearchWebSection),
				typeof(GoogleScholarSearch),
				typeof(SlashdotSearch),
				typeof(DeliciousSearch),
				typeof(SocialMediaSearchResult),
				typeof(BingSearchImageSection),
				typeof(SlashdotRss),
				typeof(SlashdotArticle),
				typeof(SlashdotItem),
				typeof(SlashdotTag),
				typeof(Tumblr),
				typeof(WeatherReport),
				typeof(WikipediaPage),
				typeof(WikipediaPageType),
				typeof(BritishCartoonArchive),
				typeof(DleseGetRecord),
				typeof(DleseUserSearch),
				typeof(GaurdianComic),
				typeof(GlobeCartoon),
				typeof(NsdlDocument),
				typeof(NsdlService),
				typeof(PoliticalCartoon),
				typeof(SfuCartoonArchive),
				typeof(TrumanLibrary1948CampaignCartoons),
				typeof(UrbanSpoonGenre),
				typeof(Topic),
				typeof(Model),
				typeof(TopicCluster),
				typeof(DocumentSet),
				typeof(KeywordSet)
			);
		}
	}
}
