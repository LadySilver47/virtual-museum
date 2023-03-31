import { Box} from '@mui/material';
import React, { useEffect, useState } from 'react'
import Artworks from './Artworks'
import { GalleryProp } from '../(Props)/props';

const MainGallery = ({pageData}: GalleryProp) => {
  return (
<main className="homepage__main">
        <Box
          className='gallery__box'
          sx={{
            display: "grid",
            gridTemplateColumns: {
              xs: "repeat(1, 1fr)",
              sm: "repeat(2, 1fr)",
              md: "repeat(3, 1fr)",
              lg: "repeat(4, 1fr)"
            }
          }}
        >
          {pageData?.map((element) => {
            return <Artworks
              key={element.id}
              id={52}
              gallery_title={element.gallery_title}
              gallery_id={element.gallery_id}
              department_title={element.department_title}
              department_id={element.department_id}
              thumbnail={element.thumbnail}
              artist_display={element.artist_display}
              title={element.title}
              place_of_origin={element.place_of_origin}
              image_id={element.image_id} />;
          })}
        </Box>
      </main>
  );
}

export default MainGallery